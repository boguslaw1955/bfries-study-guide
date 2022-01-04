/**
 *
 * This element will not have any code breaks in the exam.
 *
 *
 * User Story:
 *  - As a Pricing Manager, I can review the Fixed Cost Adjustment for each
 *      product in the calculated Pricelist, so that I have better insight into
 *      the pricing calculations.
 *
 * Acceptance Criteria / Implementation Details:
 *  - This element calculates and returns a component of the markup.
 *      - Base Markup Abs = RawMaterialCost(calculated from BoM)  *  FixedCost(of Plant)  /  VariableCost(of Plant)
 *  - If the calculation fails, a warning is added and null is returned.
 *  - The Fixed Costs of the Plants are available in Price Parameter "PlantExpenses".
 *      They are different each quarter.
 *  - The quarters are defined in the calendar Data Source "cal".
 *  - The calculated result must be available as a Pricelist column.
 */

if (!out.Plant
        || out.RawMaterialCost == null) {
    api.addWarning("Unable to calculate BaseMarkupAbs: Plant and/or RawMaterialCost are missing")
    return
}

def dmContext = api.getDatamartContext()
def table = dmContext.getDataSource("cal")

def filters = [
        Filter.equal("CalDate", api.targetDate().format("yyyy-MM-dd"))
]

def query = dmContext.newQuery(table, false)
        .select("CalDate")
        .select("CalQuarter")
        .where(*filters)

def result = dmContext.executeQuery(query)

if (!result.data.getRowCount()) {
    api.addWarning("No datasource calendar data for target date exists.")
    return null
}

def quarter = result.data.getRowValues(0)?.CalQuarter

if(!quarter){
    api.addWarning("Failed to find quarter in calendar.")
    return null
}

def expenses = api.vLookup("PlantExpenses", null, [
        Quarter: quarter,
        Plant  : out.Plant
])

if (!expenses || !expenses.FixedCost || !expenses.VariableCost) {
    api.addWarning("Costs parameter missing for plant ${out.Plant} in ${quarter}")
    return null
}

return out.RawMaterialCost * expenses.FixedCost / expenses.VariableCost