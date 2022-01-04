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

// FIXME END