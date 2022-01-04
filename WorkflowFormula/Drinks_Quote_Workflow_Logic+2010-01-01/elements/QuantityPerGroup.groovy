/**
 * User Story:
 * As a Sales Manager, I want the quote document to have approval process, in
 * order to ensure the Quote is in line with the Business Rules.
 *
 * Related User Stories:
 * As a Pricing/Sales/Finance Manager I want to be able to define:
 *  - the number of approval levels for approvable documents (i.e. Quote).
 *  - approvers for each level - a User Group.
 *  - define threshold/condition for each approval level
 * Details:
 * - The approval levels are based on the Quantity of the negotiated Products.
 * - The element returns a map that maps product groups to the total number of
 *      products quoted of that product group.
 *      product group -> Quantity of products with product group.
 *      Example: [
 *          "Cocktails": 125,
 *          "Wine": 245
 *      ]
 *  - If data is missing in the Product table, an exception is thrown.
 */

// Use method addToQuantityPerProductGroup() to aggregate the quantities into the map

// FIXME START

// FIXME END

// ============= Helper methods =============

/**
 * Called for each line item in the quote.
 * @param quantityPerProductGroup
 * @param lineItem - must be a line item with a product and NOT a folder
 */
void addToQuantityPerProductGroup(Map<String, BigDecimal> quantityPerProductGroup, Map lineItem) {
    String productGroup = api.product("ProductGroup", lineItem.sku)
    if (!productGroup) {
        api.throwException("ProductGroup is missing for product ${lineItem.sku}")
    }
    if (!quantityPerProductGroup[productGroup]) {
        quantityPerProductGroup[productGroup] = 0 // Initialize
    }
    def quantity = lineItem.inputs.find { it.name == "Quantity" }.value
    quantityPerProductGroup[productGroup] += quantity
}