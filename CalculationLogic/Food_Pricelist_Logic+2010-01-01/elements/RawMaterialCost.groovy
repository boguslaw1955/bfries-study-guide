/**
 * User Story:
 *  - As a Pricing Manager, I can see the total raw material cost in the Pricelist,
 *      so that I have more insight into how the calculation of the list price.
 *  - As a Pricing Manager, I can set the raw material costs for every combination
 *      of Plant, Raw Material and Month.
 *  - As a Pricing Manager, I can set the BoM Data master to setup the components
 *      of the product.
 *
 * Acceptance Criteria / Implementation Details:
 *  - This element calculates and returns the total raw material cost of producing
 *      the product, or null if the calculation is unsuccessful.
 *  - If the calculation is unsuccessful, a warning is added.
 *  - The raw material costs (for product components are stored) in the Price
 *      Parameter "RawMaterialCost".
 *  - The Bill Of Material data (i.e. list of product components) is stored in
 *      the BoM Data master table.
 * - the Raw Material Cost is available as a column in the price list.
 */

// FIXME START

// FIXME END

// Used to look up raw material cost
// FIXME START

// FIXME END

// Determines whether the element can return a value, or null
// FIXME START

// FIXME END

for (rawMaterial in out.RawMaterials) {

    // Check if the total Quantity has been specified

    // FIXME START

    // FIXME END

    // Check if the raw material price is present in the price parameter

    // FIXME START

    // FIXME END

    // Convert to

    // FIXME START

    // FIXME END

    // Check if currency conversion was successful

    // FIXME START

    // FIXME END
}

// Calculation successful

// FIXME START

// FIXME END