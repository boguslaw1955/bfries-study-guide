/**
 * User Story:
 *  - As a Sales Person I need to Negotiate a price or discount % for a quoted Product.
 *
 * Acceptance Criteria / Implementation Details:
 * In syntax check mode:
 *  - This element creates an input parameter for the Sales Discount (%).
 *  - The sales discount input is optional.
 *  - The sales discount input is a BigDecimal.
 *  - The sales discount input is formatted as percentage.
 * In non-syntax check mode:
 *  - This element returns the value from the sales discount input, unless the
 *      input value is out of bounds.
 *  - before returning the values, the value is checked:
 *      - if value is <  0%, a warning is added and null returned.
 *      - if value is >  100%, a warning is added and null returned.
 */

// FIXME START

// FIXME END

if (api.isSyntaxCheck()) {
    // Syntax check mode: create input parameter

    // FIXME START

    // FIXME END

} else {
    // Non-syntax check mode: read, validate and return input values

    // FIXME START

    // FIXME END

    // Max value: 100%
    // Min value: 0%

    // FIXME START

    // FIXME END
}