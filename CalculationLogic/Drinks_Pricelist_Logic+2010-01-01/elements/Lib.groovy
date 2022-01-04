/**
 * Acceptance Criteria / Implementation Details:
 *  - See javadoc comments below.
 */

/**
 * Converts given amount of money from one currency to another.
 * The exchange rate for conversion utilizes:
 *     - Price Parameter table "Chems_ExchangeRate"
 *     - TargetDate information - the Exchange Rate must be valid at the TargetDate
 * @param moneyAmount Amount of money to convert
 * @param fromCurrency Currency of the provided moneyAmount
 * @param toCurrency Currency, into which we want to convert
 * @return the converted money amount in the "toCurrency" currency
 */
BigDecimal convertMoney(BigDecimal moneyAmount, String fromCurrency, String toCurrency) {
    //    api.trace("convertMoney", "fromCurrency", fromCurrency)
    //    api.trace("convertMoney", "toCurrency", toCurrency)
    //    api.trace("convertMoney", "moneyAmount", moneyAmount)

    BigDecimal exchangeRate = 1.0
    BigDecimal resultAmount = null

    if (fromCurrency != toCurrency) {
        def conversionDateAsString = api.targetDate()?.format("yyyy-MM-dd")
        exchangeRate = api.findLookupTableValues("Drinks_ExchangeRate",
                Filter.equal("CurrencyFrom", fromCurrency),
                Filter.equal("CurrencyTo", toCurrency),
                Filter.lessOrEqual("ValidFrom", conversionDateAsString),
                Filter.greaterOrEqual("ValidTo", conversionDateAsString)
        )?.find()?.attribute2
    }

    //    api.trace("convertMoney", "exchangeRate", exchangeRate)

    if (exchangeRate != null && moneyAmount != null) {
        resultAmount = moneyAmount * exchangeRate
    } else {
        api.addWarning("Cannot convert money because either exchange rate or money amount is empty")
    }

    //    api.trace("convertMoney", "resultAmount", resultAmount)

    return resultAmount
}