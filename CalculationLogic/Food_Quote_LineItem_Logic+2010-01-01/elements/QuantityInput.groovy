/**
 * User Story
 * As a Sales Person I need to specify a quantity for a quoted Product.
 *
 * Acceptance Criteria / Implementation Details::
 * In syntax check mode:
 *  - This element creates an input parameter for the Quantity.
 *  - The quantity input is Required.
 *  - The quantity must be an integer.
 *  - This element's output values must be set to be summarized on the header level
 *      using the logic element parameter "summarize" (referenced in logic.json).
 * In non-syntax check mode:
 *  - This element returns the value from the quantity input, unless the
 *  *      input value is out of bounds
 *  - before returning the values, the value is checked:
 *      - if value is null, a warning is added.
 *      - if value is less than 0, a warning is added and null returned.
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

    // Values greater than Integer.MAX_VALUE will result in a returned String

    // FIXME START

    // FIXME END

}