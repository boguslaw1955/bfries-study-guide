/**
 * User Story:
 * - As a Sales Manager, I need to be able to visually compare the performance of the Quotes issued to
 *     the "individuals" (i.e. physical persons) versus the companies
 *
 * Acceptance Criteria / Implementation Details:
 * - This element calculates total InvoicePrice of transactions per CustomerName
 *      - sales data are available in the Datamart "Drinks_PriceRecord"
 *      - column "CustomerName" describes the name of a Company.
 *           - When the "CustomerName" is filled, the transaction was for that specific company.
 *           - When the "CustomerName" is empty, the transaction was for individual customer.
 *              - we do not distinguish among individual customers, i.e. all transactions with empty CustomerName
 *                are simply treated as single "individual" customer.
 *       - column "InvoicePrice" contains the transaction sales money amount
 * - we do not want to have Total Sales for customers, whose total sales are less than 1% of the global total sales.
 *     - the summarized total sales of those excluded customers should be under name "Other"
 * - Data returned by this element must be in a form of a List of Maps
 *      - Those data will be later visualized in a pie chart.
 *      - sample of value returned
 *              [
 *                 [ name: 'Individuals', y : 234.5 ],

 *                 [ name: 'Customer A',  y : 123.4 ],
 *                 [ name: 'Customer B',  y : 123.4 ],
 *                 [ name: 'Customer C',  y : 123.4 ],
 *                 //  ....

 *                 [ name: 'Other',       y : 678.9],
 *              ]
 *           - where the  "Induviduals" covers all customer, where the name was empty
 *           - the "Customer A" covers all transactions for the specific customer
 *           - the "Other" is the summary of total sales of the customers, whose total sales were lower, than
 *               1% of the grand total sales (available in out.TotalSales)
 *      - result value is the List which contains Maps. Each map has:
 *           - "name" : a string, which identifies, if the Total Sales is for if it's "Induviduals" or it denotes
 *                   the name of the company found in DM. This name will be used as the label of the pie chart segment.
 *           - "y" : the size of the bar chart
 *
 */

// FIXME START

// FIXME END

// We do not want to have Total Sales for customers, whose total sales are less
//  than MIN_SLICE_PERCENTAGE * the global total sales.

// FIXME START

// FIXME END

// Build filters according what is provided as inputs

// FIXME START

// FIXME END

// Aggregate the InvoicePrice per "CustomerName" and order by "Sales".
// Take only the results that exceeds the threshold MIN_SLICE_PERCENTAGE.
// If any inputs were provided, apply corresponding filters

// FIXME START

// FIXME END

// Build the data for high charts series

// FIXME START

// FIXME END