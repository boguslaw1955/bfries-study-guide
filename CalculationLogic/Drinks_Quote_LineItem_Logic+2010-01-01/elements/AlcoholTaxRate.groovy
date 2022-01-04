/**
 * User Story:
 * As a Sales Manager, I need to apply special tax to all alcoholic drinks, to be compliant with state laws.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element calculates and displays the AlcoholTaxRate.
 * - The output is formatted as a number with "€/l" suffix.
 * - To have the flexibility, the tax will be applied only, when
 *      * the Sales Rep checks the "IncludeTaxes" input checkbox on the Quote header.
 *      AND
 *      * the Sales Rep checks the "AlcoholFree" input checkbox on the Quote line item.
 * - The tax rate for alcoholic can be found in Price Parameter table "AlcoholTaxRate".
 *        This rate is specific for each drink product/sku and varies between
 *        countries (i.e. Country Codes). The value of the input "CustomerCountryCode"
 *        value is specified by the end-user on the quote header.
 * - If the AlcoholTaxRate cannot be calculated, a warning must be raised.
 */


// Skip if taxes should not be calculated, according to header input

// FIXME START

// FIXME END