/**
 * User Story:
 *  - As a Sales Person I need to look up price list data from a PriceBuilder country price list.
 *
 * Acceptance Criteria / Implementation Details:
 *  - This element calculates and returns the list price of the product.
 *  - If the calculation of the list price fails, a warning is added and null is returned.
 *  - The list prices are found in country price lists. The naming convention is
 *      as follows:
 *          Food_Pricelist_{customerCountryCode}
 *      where {customerCountryCode} is replaced by the country code of the country the Customer belong to.
 *      For example:
 *          Food_Pricelist_DE
 *  - The country code is specified in the Customer master data table.
 *  - The most recent approved price list is used where the target date is older
 *      the quote's target date.
 *  - If necessary, the list price from the price list must be converted to the quote's currency.
 */

// FIXME START

// FIXME END