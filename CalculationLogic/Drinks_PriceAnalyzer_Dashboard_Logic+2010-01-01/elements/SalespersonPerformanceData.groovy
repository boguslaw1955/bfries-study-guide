/**
 * User Story:
 * - As a Sales Manager, I need to be able to visualize the performance of the
 *      salespersons over time and compare their sales against the average
 *      performance.
 *
 * Acceptance Criteria / Implementation Details:
 * - sales data are available in the Datamart "Drinks_PriceRecord"
 *     - we're using only data rows limited by filter values entered by the user
 *     - performance is calculated from column "InvoicePrice"
 *     - date of the transaction is available in column "ValidAfter"
 * - This element calculates and returns a map which contains the data to be
 *      visualized in a bar chart.
 * - The map has properties, all three contains arrays:
 *      - "months"
 *          - an array of String, where the elements are the months
 *      - "averageSales"
 *          - an array of BigDecimal, where the elements are the average sales
 *              per salesperson for that month.
 *          - The strings are formatted as "yyyy-'M'MM" (as they are formatted in
 *              the calendar).
 *          - The array only contains the months that occur between the two
 *      - "salespersonSales"
 *          - an array of BigDecimal, where the elements are the total sales for
 *              that month and for the selected salesperson.
 *          - this property is only present if the end-user has selected a salesperson
 *              in the input field.
 */


//do not use the Salesperson in the filters, we need numbers across all of them

// FIXME START

// FIXME END
