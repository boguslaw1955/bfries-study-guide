/**
 * User Story:
 * As a Pricing Analyst I need a summary report from Transactional data.
 *
 * Details:
 * The source report data are in DM Food_Transaction, and we need to get summary/totals of:
 * Local List Price, Sales Discount, Invoice Price, COGS, Gross Margin
 * for all combinations of dimensions:
 * Month of Invoice Date, Region, Country, Business Unit and Product Group.
 *
 * The money should be reported in EUR.
 *
 * The report data needs to be stored in DS Food_Report.
 *
 * Acceptance Criteria / Implementation Details:
 * - all of the following fields (here we refer to them by labels) in the DS "Food_Report" must be populated with values.
 *         - Month (formatted as it is stored in calendar: "yyyy-'M'MM")
 *         - Region
 *         - Country
 *         - Business Unit
 *         - Product Group
 *         - Quantity
 *         - Currency (from the element ReportCurrency)
 *         - Local List Price
 *         - Sales Discount
 *         - Invoice Price
 *         - COGS
 *         - Gross Margin
 *  - If the queried Business Unit or Product Group data is null, the default
 *      value is an empty string (because these two columns are keys and must have values)
 */

// FIXME START

// FIXME END

/* Get the rowset of the target table. The target table is defined in the DataLoad.
    The method name suggests the table is a Datamart, but it can actually be any
     PriceAnalyzer table, for example a DataSource. */

// FIXME START

// FIXME END

// Return null, otherwise (in Groovy) the value of the last
//  statement is returned as a result value of the element
return