/**
 * Converts given amount of money from one currency to another.
 * The exchange rate for conversion utilizes:
 *     - Price Parameter table "Chems_ExchangeRate"
 *     - TargetDate information
 * @param moneyAmount Amount of money to convert
 * @param fromCurrency Currency of the provided moneyAmount
 * @param toCurrency Currency, into which we want to convert
 * @return
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