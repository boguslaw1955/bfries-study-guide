/**
 * Acceptance Criteria / Implementation Details:
 *  - See javadoc comments below.
 */

/**
 *  This function converts money between two currencies. The exchange rates are
 *      specified in the Price Parameter table "ExchangeRates". The most recent
 *      Exchange rate that is also older than the <code>validOn</code> will be
 *      used.
 *
 * @param amount The amount of money to be converted in the currency <code>currencyFrom</code>.
 * @param currencyFrom The currency of <code>amount</code> / the currency to be converted from.
 * @param currencyTo The currency to convert to.
 * @param validOn The date used to look up the exchange rates.
 * @return The amount converted to the currency <code>currencyTo</code>, or
 *          <code>null</code> if the conversion fails.
 */
BigDecimal convertMoney(BigDecimal amount, String currencyFrom, String currencyTo, Date validOn) {
    if(null in [currencyFrom, currencyTo, amount, validOn]){
        return null
    }
    if (currencyTo == currencyFrom) {
        // Exchange rate is 1
        return amount
    }
    def table = api.findLookupTable("ExchangeRates")
    def row = api.find("MLTV3", 0, 1, "-key3",
            Filter.equal("lookupTable.id", table?.id),
            Filter.equal("CurrencyFrom", currencyFrom),
            Filter.equal("CurrencyTo", currencyTo),
            Filter.lessOrEqual("ValidFrom", validOn)
    )?.find()
    BigDecimal exchangeRate = row?.attribute1 // attr Exchange Rate

    BigDecimal resultAmount = null

    if (exchangeRate != null && amount != null) {
        resultAmount = amount * exchangeRate
    } else {
        api.addWarning("Cannot convert money because either exchange rate or money amount is empty")
    }

    //    api.trace("convertMoney", "originalAmount", amount)
    //    api.trace("convertMoney", "exchangeRate", exchangeRate)
    //    api.trace("convertMoney", "resultAmount", resultAmount)

    return resultAmount
}