/**
 * User Story:
 * As a Sales Rep, I need to have VAT Rate displayed on the Quote Line item.
 *
 * Acceptance Criteria / Implementation Details:
 * - this elements calculates and displays the VAT rate used for calculation of VAT applied to the product in the country
 * - Vat rate must be formatted as percentage
 * - the VAT will be used only, when the Sales Rep checks the "IncludeTaxes" input checkbox on the Quote header.
 * - the VAT rates are defined by Pricing Managers in the Price Parameter table "VatRate". The rate is different across countries (defined per Country Code)
 *            - CustomerCountryCode value is available as Quote header input field
 */

// Skip if taxes should not be calculated, according to header input

// FIXME START

// FIXME END