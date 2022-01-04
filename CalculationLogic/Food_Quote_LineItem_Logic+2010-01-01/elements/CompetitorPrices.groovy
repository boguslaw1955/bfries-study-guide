/**
 * Acceptance Criteria / Implementation Details:
 *  - This element returns all competitive data for the product that is older than
 *      the quote's target date.
 *  - The returned data is an array where each element corresponds to a row in
 *      the Master Data table "ProductCompetition". The elements in the array
 *      have the following properties:
 *          - sku,
 *          - country           : The country code of the country where the competitive price was recorded,
 *          - infoDate          : The date that the competitive data was recorded on,
 *          - competitor        : The name of the competitor,
 *          - price             : The recorded price, converted to the quote's currency.
 *          - currency          : The quote's currency
 *          - originalPrice     : The recorded price, in the ,
 *          - originalCurrency  : row.
 *      Note: the names of the keys has match exactly (case-sensitive).
 *  - The currency conversion must be done using the Price Parameter "Exchange Rate"
 *  - If the currency conversion fails for one competition price, the competition
 *      price is ignored (not added to the element result output) and a warning
 *      is added.
 */

// FIXME START

// FIXME END

def competitions = []

// FIXME START

// FIXME END

// Add warnings for failed currency conversions

// FIXME START

// FIXME END

return competitions