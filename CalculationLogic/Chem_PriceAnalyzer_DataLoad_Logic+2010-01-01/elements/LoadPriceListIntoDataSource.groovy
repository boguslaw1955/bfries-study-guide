/**
 * User Story:
 * - As a Pricing Analyst, I need to be able to analyze price lists with charts in
 *      the Price Analyzer module.
 *
 * Details:
 * - The source data is located in the price lists for Chemicals.
 * - The price lists is recognized to be a chemicals price list if the label
 *      starts with "Chem_".
 * - The logic is used in a calculation data load where the target table is the
 *      "Chem_PriceListItems" Data Source table.
 *
 * Acceptance Criteria:
 * - The logic must be able to copy all price list items from the chemicals price
 *      lists into the target Data Source table.
 * - Only price lists items from approved price lists should be copied over.
 * - The following data should be copied over into the target Data Source table:
 *      - ProductId (sku)
 *      - Region (output from Chem_PriceList_Logic logic element)
 *      - TargetDate (Target date of the price list)
 *      - PriceList (the label name of the price list)
 *      - CreatedBy (username of the creator of the pricelist)
 *      - ResultPrice
 *      - Currency
 */

// FIXME START
def plIterator = api.stream("PL", null)

def chemPLs = plIterator?.findAll { pl ->
    pl.label.startsWith("Chem_") && pl.approvalState == "APPROVED"
}?.collectEntries { pl -> [(pl.id): pl]}

plIterator?.close()

if (chemPLs == null) {
    api.addWarning("Nie można znależć priceList")
    return
}

def itemIterator = api.stream("PLI", "sku")

for(def plit in itemIterator)
{
    api.trace("test ", plit.allCalculationResults)
    def chemPL =  chemPLs[plit.pricelistid]
    if(!chemPL){ continue}
 //   def region = plit.allCalculationResults.find{ it.resultName == "Region"}.result
 //
     def pli = api.find("PLI", null).find()

    api.trace(pli.allCalculationResults.find { it.resultName == "BaseCostCurrency"}.result)
    String createdBy = api.find("U", 0, 1, null,
            Filter.equal("id", chemPLs[plit.pricelistId].createdBy)).find().loginName

    def targetRowset = api.getDatamartRowSet("target")
    def row = [
            ProductId   : plit.sku,
            Region   : region,
            TargetDate  : chemPLs[plit.pricelistId].targetDate,
            PriceList: chemPLs[plit.pricelistId].label,
            CreatedBy   : createdBy,
            ResultPrice   : plit.resultPrice,
            Currency   : plit.currency,
    ]

    targetRowset?.addRow(row)
    api.trace("${row.ProductId} ${row.Region} ${row.TargetDate} ${row.PriceList} ${row.CreatedBy} ${row.ResultPrice} ${row.Currency}")
    targetRowset?.addRow(row)
}
// FIXME END