/**
 * User story:
 *  - As a Pricing Manager, I can see the calculated country List Price (and it's
 *      value copy in the Result Price) in the generated Pricelist, because it
 *      will be used by subsequent processes (like Quote, etc.)
 *
 * Acceptance Criteria / Implementation Details:
 * - This element calculates the List Price :
 *      List Price = Raw Material Cost + Markup Abs
 * - If the calculation fails, a warning is added and null is returned.
 * - If a more competive price was found in the element "LowestCompetitorPrice",
 *      a yellow alert is added.
 * - If a more competitive product wasn't found, the price will be rai
 * - The element output must be available as a Pricelist column.
 */

// FIXME START

// FIXME END

// Check whether competitive data is available
if (out.MostCompetetivePrice) {

    // Check whether a more competitive price exists on the market

    // FIXME START

    // FIXME END

    // Check if price can be raised

    // FIXME START

    // FIXME END

    // Calculate the minimum list price

    // FIXME START

    // FIXME END

    // Raise the price

    // FIXME START

    // FIXME END
}

// FIXME START

// FIXME END