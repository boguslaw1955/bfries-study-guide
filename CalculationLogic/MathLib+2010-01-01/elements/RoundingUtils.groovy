import java.math.RoundingMode

/**
 * Rounds the given number to N decimal places, using the commonly rounding rule "half-up"
 * @param number
 * @param decimalPlaces
 * @return null if the price is null
 */
BigDecimal round(BigDecimal number, int decimalPlaces) {
    if (number == null) {
        return null
    }
    return number.setScale(decimalPlaces, RoundingMode.HALF_UP)
}


/**
 * Rounds a price to N decimals. If the decimalPlaces are not used , by default uses 2.
 * @param price
 * @param decimalPlaces
 * @return
 */
BigDecimal roundPrice(BigDecimal price, int decimalPlaces = 2) {
    return round(price, decimalPlaces)
}


/**
 * Round a percentage number to 2 decimals
 * Note: The percent numbers are expected in the way, that 1% is represented as 0.01. So rounding to 2 decimal places basically means to round such number to 4 decimal places.
 * @param percentNumber
 * @return null if the price is null
 */
BigDecimal roundPercent(BigDecimal percentNumber, int decimalPlaces = 2) {
    return round(percentNumber, decimalPlaces + 2)
}

/**
 * Rounds the given number "up" (aka "ceiling") to a provided number of decimal places.
 * @param number
 * @param decimalPlaces
 * @return null if the price is null
 */
BigDecimal roundUp(BigDecimal number, int decimalPlaces) {
    if (number == null) {
        return null
    }
    return number.setScale(decimalPlaces, RoundingMode.ROUND_UP)
}