/**
 * User Story
 * As a Sales Rep, I need to see on the Line item the List Price of the product which is found in the regional pricelist.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element returns the List Price of the product (found in a pricelist), and recalculated to the currency of the customer
 * - the name of the pricelist starts with "Chem_Pricelist_" and continues with the name of the customer Region (so for example
 *     the full name could be "Chem_Pricelist_Europe")
 * - The region of the Customer should be found in the Price Parameter table "CountryInfo", and as a lookup key you should use
 *       the CountryCode information found in the Customer table
 * - the List price is in column "resultPrice" and it's currency in the column "currency"
 */

// FIXME START

// FIXME END
