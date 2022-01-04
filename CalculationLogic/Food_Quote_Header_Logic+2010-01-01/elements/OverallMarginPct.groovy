/**
 * User Story:
 *  As a Sales Person I want to view aggregated values for the quote (margin %),
 *      so I can negotiate it with the customer.
 *
 * Acceptance Criteria / Implementation Details:
 *  - The element calculates the Overall Margin % for the entire quote.
 *  - The overall Margin % is calculated as follows:
 *      - Overall Margin % = (total margin of the entire quote) / (total invoice price of the entire quote)
 *          (Summarized over the line items): Overall Margin % = ∑(Margin * Quantity) / ∑(InvoicePrice * Quantity)
 *      - The total margin of the entire quote is the sum of the total margin on the line items.
 *          - The total margin on the line item = Margin * Quantity
 *      - The total invoice price of the entire quote is the sum of the total invoice prices on the line items.
 *          - The total invoice price on the line item = InvoicePrice * Quantity
 *
 *  - The calculated value is added as an output
 *      - on the root level
 *      - The name is "OverallMarginPct".
 *      - The label is "Overall Margin %"
 *      - The output value must be formatted as a percentage.
 *
 *  - If the calculation cannot be completed:
 *      - a warning must added to the "OverallMarginPct" output (and not added otherwise)
 *      - the output value should be empty (null).
 *
 *  - The calculation is only done in post phase.
 */

// FIXME START

// FIXME END

BigDecimal invoicePriceTotal = 0.0
BigDecimal marginTotal = 0.0
List<String> warnings = []

def invoicePricePerUnit, marginPerUnit, quantity

for (line in quoteProcessor.quoteView.lineItems) {
    //skip folders
    if (line.folder) {
        continue
    }
    invoicePricePerUnit = line.outputs?.find { it.resultName == "InvoicePrice" }?.result
    marginPerUnit = line.outputs?.find { it.resultName == "Margin" }?.result
    quantity = line.outputs?.find { it.resultName == "Quantity" }?.result

    if (null in [invoicePricePerUnit, marginPerUnit, quantity]) {
        // Exam Note: The following 5 lines will not have any code breaks in the exam.
        warnings << "Unable to calculate Overall Margin %: line item SKU: '${line.sku}' doesn't have values for InvoicePrice, Margin and/or Quantity.".toString()
        continue
    }
    invoicePriceTotal += invoicePricePerUnit * quantity
    marginTotal += marginPerUnit * quantity
}

// FIXME START

// FIXME END
