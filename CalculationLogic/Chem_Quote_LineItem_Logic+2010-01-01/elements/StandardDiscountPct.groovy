/**
 * User Story
 * As a Sales Manager, I need to ensure, that the customer receives the "Standard" Discount pre-negotiated with the Customer.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element returns the % value of the Standard Discount found in the Price Parameter table "StandardDiscount"
 * - the Standard Discount value was negotiated by the Sales team and is stored based on:
 *        - product's ProductGroup
 *        - customer's CustomerType
 *        - customer's Region
 * - The region of the Customer should be found in the Price Parameter table "CountryInfo", and as a lookup key you should use
 *       the CountryCode information found in the Customer table
 */

return api.vLookup("StandardDiscount", "attribute1",
        api.product("ProductGroup"),
        api.customer("CustomerType"),
        api.vLookup("CountryInfo", "RegionName", api.customer("CountryCode"))
)