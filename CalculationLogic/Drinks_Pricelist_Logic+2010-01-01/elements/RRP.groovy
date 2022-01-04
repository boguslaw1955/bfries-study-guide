/**
 * User Story:
 * As a Pricing Manager, I want to have in the priceslist the Recommended Retail Price (RRP) price
 * to be used either as ListPrice or as a reference for comparison.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element returns the RRP price of the product in the pricelist currency
 * - The RRP and it's currency is found in the Product Extension table "Drinks_RRP"
 * - we're using the last available RRP, but which is before (or at) the Target Date
 * - the RRP price might not be available for the product, that's common, in that case this element returns 'null'
 */

// FIXME START

// FIXME END