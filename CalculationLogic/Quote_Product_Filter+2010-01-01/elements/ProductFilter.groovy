/**
 * This element will not have any code breaks in the exam.
 */

/**
 * User Story:
 * As a Sales Manager, I want the Sales Rep to see only Products from the Business Unit appropriate to the Quote Type used to create the Quote.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element returns a Filter to be applied by Pricefx, when offering list of Products to the user when adding Products to the Quote.
 */

//QuoteType values == Chemicals Drinks, Food == BusinessUnit values
def businessUnit = quote?.quoteType

if (businessUnit in ["Chemicals", "Drinks", "Food"]) {
    return Filter.equal("attribute1", businessUnit) //BusinessUnit
}

return null
