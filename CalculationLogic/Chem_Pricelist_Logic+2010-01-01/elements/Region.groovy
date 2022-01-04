/**
 * User Story:
 * - As a Pricing Manager, while creating new Pricelist, I can select (from a
 *      drop-down field) a Region for which I'm generating the prices, because I
 *      need the prices to be relevant to the selected Region.
 *
 * Acceptance Criteria / Implementation Details:
 * - The name of the region must be available as a column in the generated price list.
 * - This element does two things:
 *      1) If executed in Syntax check mode:
 *          - Creates an input parameter of type 'option'.
 *          - The user is required to enter value into this input.
 *          - Both the values and the labels of the drop down options are region names.
 *          - The list of region names is stored in the Price Parameter 'RegionInfo'.
 *          - The name of the input parameter is "Region".
 *      2) If executed in non-syntax check mode:
 *          - Raises a warning if the input has not been chosen by the end-user.
 *          - Returns the chosen value of the input.
 */


// FIXME START

// FIXME END
