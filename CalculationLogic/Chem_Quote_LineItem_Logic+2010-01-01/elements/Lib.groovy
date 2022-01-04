/**
 * Acceptance Criteria / Implementation Details:
 *  - See javadoc comments below.
 */

/**
 *  This function converts money between two currencies. The exchange rates are
 *      specified in the Price Parameter table "Chems_ExchangeRate".
 *      The exchange rate is picked up based on the given fromCurrency, toCurrency and based on the Target Date (from context).
 *      The target date must fall in between (inclusive) the values ValidFrom and ValidTo found in the Price Parameter.
 *
 *
 * @param moneyAmount The amount of money to be converted. The amount is in the currency <code>currencyFrom</code>.
 * @param fromCurrency In which currency is the provided <code>moneyAmount</code>
 * @param toCurrency In which currency would you like the result
 * @return Amount of Money in the toCurrency, or null, if error occurred
 */
BigDecimal convertMoney(BigDecimal moneyAmount, String fromCurrency, String toCurrency) {
    BigDecimal exchangeRate = 1.0
    BigDecimal resultAmount = null

    if (fromCurrency != toCurrency) {
        def conversionDateAsString = api.targetDate()?.format("yyyy-MM-dd")
        exchangeRate = api.findLookupTableValues("Chems_ExchangeRate",
                Filter.equal("FromCurrency", fromCurrency),
                Filter.equal("ToCurrency", toCurrency),
                Filter.lessOrEqual("ValidFrom", conversionDateAsString),
                Filter.greaterOrEqual("ValidTo", conversionDateAsString)
        )?.find()?.attribute2
    }

    if (exchangeRate != null && moneyAmount != null) {
        resultAmount = moneyAmount * exchangeRate
    } else {
        api.addWarning("Cannot convert money because either exchange rate or money amount is empty")
    }

    return resultAmount
}