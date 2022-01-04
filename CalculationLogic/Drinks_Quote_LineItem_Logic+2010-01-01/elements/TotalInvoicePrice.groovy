/**
 * This element will not have any code breaks in the exam.
 */
/**
 * User Story:
 * In order to simplify negotiation process, as a Sales Rep, I want to see:
 *  - the Total money amount of Invoice Price on the quote line item
 *  - summary of all Total Invoice Prices across all lines on the Quote header,
 *
 * Acceptance Criteria / Implementation Details:
 * - this element calculates and displays total amount of Invoice Price money for all Quantity negotiated on the line item
 * - this element also cause summarization of all TotalInvoicePrice-s across all line item and their display on Quote Header
 * - TotalInvoicePrice = InvoicePrice(per unit) * Quantity
 *
 */
if (out.InvoicePrice == null || out.Quantity == null) {
    api.addWarning("Cannot calculate Total Invoice Price, because Invoice Price and/or Quantity is missing.")
    return null
}

return out.InvoicePrice * out.Quantity