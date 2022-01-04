/**
 * User Story:
 * As a Pricing Manager, I want to have in the pricelist the Competitor price,
 * either to be used as a List Price or as a reference.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element returns the Competitior price of the product in the pricelist currency
 * - The product Competition data are available in the Product Competition table. We will use only those data, where
 *      - the Competition Type is "Online"
 *      - we need to find the latest competitor price before the pricelist validity date
 *            - the date of price observation is in the column "infoDate"
 *            - the Competition data must have been observed at least a day before the Pricelist validity start
 * - the Competition data might not be available, it's ok. In that case it is 'null'
 * - the Competitor price must be returned in the pricelist currency
 */

// FIXME START

// FIXME END
