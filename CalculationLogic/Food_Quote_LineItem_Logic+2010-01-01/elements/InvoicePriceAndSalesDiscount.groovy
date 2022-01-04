/**
 * Acceptance Criteria / Implementation Details:
 *  - This element calculates and returns the Sales Discount and the Invoice Price.
 *  - The returned element is a groovy map with two keys:
 *      - "InvoicePrice" (as money)
 *      - "SalesDiscount" (as money)
 *  - When both Requested Price and Sales Discount % are entered by the end-users,
 *      the Requested Price takes precedence over the Sales Discount %. The prices
 *      are calculated as follows:
 *          Invoice Price = Requested Price
 *          Sales Discount = List Price - Requested Price
 *  - When the Requested Price is not entered by the end-user, the prices are
 *      calculated as follows:
 *          Invoice Price = List Price * (1 - Sales Discount %)
 *          Sales Discount = List Price * Sales Discount %
 *          - The value of the Sales Discount % defaults to 0 if not entered.
 */

def result = [:]

if (out.ListPrice == null) {
    // FIXME START

    // FIXME END
}

if (out.RequestedPriceInput != null) {
    // Requested Price input has priority over Sales Discount input
    // FIXME START

    // FIXME END
} else {
    // FIXME START

    // FIXME END
}

return result