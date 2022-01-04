import net.pricefx.common.api.FieldFormatType

/**
 * This element will not have any code breaks in the exam.
 */
/**
 * User Story:
 * As a Sales Rep, I need to be able to enter the Invoice Price (per unit) negotiated with customer for the product, in order override the price coming from the Pricelist.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element builds the input field "InvoicePrice" where the user can enter a decimal point number, which describes money amount in EUR currency
 * - the input field will be formatted as Money in EUR currency
 */

final String INPUT_INVOICE_PRICE = "InvoicePrice"

if (api.isSyntaxCheck()) {
    api.decimalUserEntry(INPUT_INVOICE_PRICE)
    def param = api.getParameter(INPUT_INVOICE_PRICE)
    param.setLabel("Invoice Price")
    param.setConfigParameter("formatType", FieldFormatType.MONEY_EUR)
}