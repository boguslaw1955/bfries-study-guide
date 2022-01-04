/**
 * User Story
 * As a Sales Rep, I need to select the Payment Terms on the Quote header (i.e. only once for the whole Quote),
 * so that we can calculate the Cash Discount given to the customer.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element returns the value selected by the user on the Quote Header in the input parameter "PaymentTerms"
 * - during testing of the quote line item logic, we need to be able to specify the PaymentTerms value,
 *     even if the header information is not available during test. The values of the possible PaymentTerms are stored
 *     in the Price Parameter table "CashDiscount", in column "PaymentTerms".
 */

if (api.isDebugMode()) {
    //during testing  we need to be able to enter the PaymentTerms even if in real quote it will be entered on the Header input
    // and here we'd only access the entered value here
// FIXME START

// FIXME END
} else {
// FIXME START

// FIXME END
}