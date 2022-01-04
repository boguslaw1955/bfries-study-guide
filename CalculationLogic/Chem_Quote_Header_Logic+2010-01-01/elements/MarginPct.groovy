/**
 * User Story:
 * - As a Sales Manager, I want to see the Overall Margin % for the whole Quote.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element calculates and adds an output on the quote header for the Margin %
 *      MarginPct = TotalMargin / TotalNetPrice
 * - Use results "TotalMargin" and "TotalNetPrice" from the quote root/header.
 *   Note: these two results are calculated automatically by the system because
 *      of the property "summarize" is set to true on the line item logic element.
 * - the result is
 *      - named "MarginPct"
 *      - labeled "Margin %"
 *      - formatted as percentage
 * - If the Margin % cannot be calculated, report the issue with Warnings on the
 *      header output.
 */

// FIXME START

// FIXME END