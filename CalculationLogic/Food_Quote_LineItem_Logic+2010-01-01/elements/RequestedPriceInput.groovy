/**
 * User Story:
 *  As a Sales Person I need to Negotiate a price or discount % for a quoted Product.
 *      When both Requested Price and Sales Discount are entered, the Requested
 *      Price takes precedence over the Sales Discount.
 *
 * Acceptance Criteria / Implementation Details:
 * In syntax check mode:
 *  - This element creates an input parameter for the Requested Price.
 *  - The Requested Price input is optional.
 *  - The Requested Price input is a BigDecimal.
 * In non-syntax check mode:
 *  - This element returns the value from the Requested Price input, unless the
 *      input value is out of bounds.
 *  - before returning the values, the value is checked:
 *      - if value is <  0%, a warning is added and null returned.
 */

// FIXME START

// FIXME END

if (api.isSyntaxCheck()) {
    // Syntax check mode: generate input parameter

    // FIXME START

    // FIXME END

} else {
    // Non-syntax check mode: read, validate and return input values
    // Min value: 0

    // FIXME START

    // FIXME END

}