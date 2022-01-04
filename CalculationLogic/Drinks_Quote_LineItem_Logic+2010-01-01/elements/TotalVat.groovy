/**
 * User Story:
 * In order to simplify negotiation process, as a Sales Rep, I want to see:
 *  - the Total money amount of VAT on the quote line item
 *  - summary of all Total VAT-s across all lines on the Quote header,
 *
 * Acceptance Criteria / Implementation Details:
 * - this element calculates and displays Total amount of VAT money appliad to the Total Invoice Price on the line item
 *     - the number will be calculated only, when the Sales Rep checks the "IncludeTaxes" input checkbox on the Quote header.
 * - this element also cause summarization of all TotalVat-s across all line item and their display on Quote Header
 * - TotalVat = VatRate * TotalInvoicePrice
 *
 */

// Skip if taxes should not be calculated, according to header input

// FIXME START

// FIXME END