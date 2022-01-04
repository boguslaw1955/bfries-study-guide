/**
 * This element will not have any code breaks in the exam.
 */
/**
 * User Story:
 * As a Sales Rep, I need to be able to enter the Quantity negotiated with the customer.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element builds the input field "Quantity"
 * - the Quantity is a "whole" number in this scenario, the user cannot enter decimal point numbers
 */


if (api.isSyntaxCheck()) {
    api.integerUserEntry("Quantity")
}