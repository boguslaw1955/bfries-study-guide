/**
 * User Story
 * As a Pricing Analyst, I need to be able to analyze and aggregate the Datamart data across Monthes, Quarters, Years and Weeks.
 * This applies to all date columns which would be used in the Datamart (e.g. Invoice Date, Shipping Date, ...)
 *
 * Acceptance Criteria / Implementation Details
 * - this element adds (or updates) to the DataSource "cal" all the date-conversion rows, in the range of dates between (inclusive) days DateFrom and DateTo,
 *       which the user can set up in the Calculation Dataload "Calendar" screen.
 * - if the user has not supplied the values of DateFrom or DateTo, the process should raise exception and not proceed any action.
 * - the data rows added will follow the rules of Gregorian calendar (i.e. to use common calendar rules widely used)
 *     when finding into which Week, Month, Quarted and Year the date belongs.
 * - to understand required formatting, here are some samples of the data for day  June 2nd, 2020
 *     - date:    2020-06-02
 *     - week:    2020-W23
 *     - month:   2020-M06
 *     - quarter: 2020-Q2
 *     - year:    2020
 * - Note: to find out the Week, into which the date belongs, simply rely on the week number provided by java.util.Date.
 *     No need to distinguish between behavior in various countries.
 */

// FIXME START

// FIXME END