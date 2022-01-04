/**
 * User Story:
 * As a Pricing Analyst I need a summary report from Transactional data.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element queries the Datamart "Food_Transaction" and returns the Query object.
 * - The following data should be gathered by the query:
 *      - The data are grouped by/aggregated by the following dimensional columns:
 *          - InvoiceDateMonth
 *          - Region
 *          - Country
 *          - BusinessUnit
 *          - ProductGroup
 *      - The Quantity is summarized from all line items of the aggregated group:
 *          - Quantity
 *      - Money columns contains summary of totals from all the line items of the aggregated group.
 *          - LocalListPrice
 *          - SalesDiscount
 *          - InvoicePrice
 *          - COGS
 *          - GrossMargin
 * - All money columns are summarized in the requested currency from the element "ReportCurrency".
 */

// The money columns will be summarized when the argument 'rollup' is true.

// FIXME START

// FIXME END

// The money values will be converted to given unified currency before the rollup
// !This line will not break and will not be tested on the exam
query.setOptions(["currency": out.ReportCurrency])

return query
