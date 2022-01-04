/**
 * User Story:
 * As a Pricing Manager, I need the List price to be calculated based on the defined strategy.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element returns a Map, with 2 things: "strategy" and "price" - i.e. the ListPrice, including the strategy used.
 *      - for example  [strategy: "Cost Plus", price: 10.4]
 * - the strategy is defined in the Price Parameter table "Strategy". This table is manually maintained by Pricing Manager.
 *    - we recognize 3 strategies: "Competitor Based",  "Cost Plus" and "Recommended Retail Price"
 * - the strategies are evaluated according their priorities. We will return the first available value.
 *    - if we were able to calculate price of strategy 1., then such price will be returned as ListPrice
 *    - if we were able to calculate price of strategy 2., then such price will be returned as ListPrice
 *    - if we were able to calculate price of strategy 3., then such price will be returned as ListPrice
 *    - if unrecognized strategy is found in the Price Parameter table, it is skipped, and the user it warned about that.
 *    - if we recognize the strategy, but it's value is not available, the user us warned about that.
 *
 */


// FIXME START

// FIXME END