/**
 * User Story:
 * In order to simplify negotiation process, as a Sales Rep, I want to see:
 *  - the Total money amount of Alcohol Tax on the quote line item
 *  - summary of all Total Alcohol Tax-es across all lines on the Quote header,
 *
 * Acceptance Criteria / Implementation Details:
 * - this element calculates and displays Total amount of Alcohol Tax money for Total Volume negotiated on the line item
 *     - the number will be calculated only, when the Sales Rep checks the "IncludeTaxes" input checkbox on the Quote header.
 * - this element also cause summarization of all TotalAlcoholTax-es across all line item and their display on Quote Header
 * - TotalAlcoholTax = AlcoholTaxRate * TotalVolume
 *
 */

// Skip if taxes should not be calculated, according to header input

// FIXME START

// FIXME END