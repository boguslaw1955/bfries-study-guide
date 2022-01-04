/**
 * User Story:
 * - As a Pricing Manager, while creating new Pricelist, I can select (from a drop-down field) a Country for which I'm generating the prices, because I need the prices to be relevant to the selected Country.
 *
 * Acceptance Criteria / Implementation Details:
 *  - the CountryCode must be available as a Pricelist column.
 * - This element does two things:
 *      1) If executed in Syntax check mode:
 *          - Creates a REQUIRED (non-optional) input parameter of type 'option'.
 *          - The drop down input has
 *              - country names as labels
 *              - country codes as values
 *          - The list of countries is stored in the Price Parameter 'CountryInfo'.
 *              - The values of the drop down options are stored in the column "CountryCode".
 *              - The labels of the drop down options are stored in the column "CountryName".
 *          - The options in the drop down list must be sorted by the label (which
 *              is the country name).
 *      2) If executed in non-syntax check mode:
 *          - Raises a warning if no input has not been chosen by the end-user.
 *          - Returns the input country code.
 *
 *
 */

final String INPUT_COUNTRY_CODE = "CountryCode"

if (api.isSyntaxCheck()) {
    // Executed in syntax check mode

    // FIXME START

    // FIXME END

} else {
    // Executed in NON-syntax check mode

    // FIXME START

    // FIXME END

}


