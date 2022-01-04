/**
 * User Story:
 * - As a Pricing Manager, I  want to compare the product's list price to its competitors.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element calculates and returns the most competitive price.
 *      - The competition prices are converted to the price list's currency.
 *          - The conversion date is the competition's infoDate.
 *              - competition currency on infoDate -> price list currency on infoDate.
 *      - The competition prices are given by the master data table "CompetitionData".
 *      - If no competition price is found, null is returned (without warnings).
 *      - Only prices that are older than the target date are considered.
 *      - Only prices that are younger than (exactly) 180 days are considered,
 *          counted from the date of the target date.
 * - The Most Competitive Price is available as a column in the price list.
 */

// Min is null aware, i.e. null values from failed currency conversions are filtered out

// FIXME START

// FIXME END