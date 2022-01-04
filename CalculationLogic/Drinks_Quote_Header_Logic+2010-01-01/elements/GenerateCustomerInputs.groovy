/**
 * User Story:
 *  As a Sales Person, I need to be able to enter a Customer for the Quote, even if the customer information was not yet uploaded into the system.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element builds 2 additional inputs on the Quote Header:
 *     - "CustomerName" - is a text input field, where the Sales Rep can enter
 *          the Customer Name.
 *     - "CustomerCountryCode" - is a dropdown input field, with list of customer
 *          Countries ( ["SE": "Sweden", "DE": "Germany"] )
 *     - ("Customer" input is there by default)
 * - If a value for the (default) input "Customer" is provided, then the input
 *      parameters "CustomerName" and "CustomerCountryCode" should be...
 *     - populated with values from the CUSTOMER MASTER table. I.e. the end-user does
 *          not get a chance to provide values for these inputs.
 *     - set as read only
 *     - set as non-required
 * - If a value for the (default) input "Customer" is NOT provided, then the input
 *      parameters "CustomerName" and "CustomerCountryCode" should be...:
 *     - entered by the END-USER.
 *     - set as NOT read-only
 *     - set as Required
 */

// FIXME START

// FIXME END

//TODO this condition is only temporary workaround for an issue in Unity (will be removed soon)
if (!(quoteProcessor.quoteView.inputs.find { it.name == "Customer" })) {
    return
}

// FIXME START

// FIXME END

// Find the id of the customer selected by the end-user

// FIXME START

// FIXME END

// Check if a value has been provided by end-user.
// (The "Customer" Input on the header is not required).

// Populate the inputs "CustomerName" and "CustomerCountry" with values from
//  the Customer table.

// Make the input readonly and not required

// FIXME START

// FIXME END