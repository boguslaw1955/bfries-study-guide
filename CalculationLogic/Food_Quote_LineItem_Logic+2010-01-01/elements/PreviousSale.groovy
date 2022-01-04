/**
 * This element will not have any code breaks in the exam.
 *
 * User Story:
 *  - As a Sales Person I need to view a previous price (based on historical data) transacted by the Customer.
 *      Available data: Invoice Price per unit, Margin %, Date.
 *
 * Acceptance Criteria / Implementation Details:
 *  - This element retrieves the most recent transaction of this product from the
 *      Datamart "Transaction" where the invoice date is before the target date,
 *      or null if no such transaction exists.
 *  - The returned data must contain the following keys (exact name match, case-sensitive).
 *      - InvoiceLineId
 *      - Currency
 *      - InvoicePricePerUnit
 *      - MarginPct
 *      Two of the values are calculated:
 *          - InvoicePricePerUnit = InvoicePrice / Quantity
 *          - MarginPct = GrossMargin / LocalListPrice
 */


def dmCtx = api.getDatamartContext()
def query = dmCtx.newQuery(dmCtx.getDatamart("Food_Transaction"), false)
        .select("InvoiceLineId")
        .select("InvoicePrice / Quantity", "InvoicePricePerUnit")
        .select("GrossMargin / LocalListPrice", "MarginPct")
        .select("Currency")
        .where(
                Filter.equal("ProductId", out.ProductId),
                Filter.equal("CustomerId", out.CustomerId),
                Filter.lessOrEqual("InvoiceDate", out.EffectiveDate)
        )
        .orderBy("InvoiceDate DESC")
        .setMaxRows(1)

return dmCtx.executeQuery(query)?.data?.find()