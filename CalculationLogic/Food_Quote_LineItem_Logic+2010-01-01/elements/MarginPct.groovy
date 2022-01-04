/**
 * User Story:
 * - As a Sales Person I can see the % amount of margin and be alerted when it's
 *      below certain thresholds, to be able to review potential problems with
 *      profitability of the products
 *
 * Acceptance Criteria / Implementation Details:
 *  - This element calculates and returns the Margin %:
 *      Margin % = Margin / Invoice Price = (Invoice Price - Cost) / Invoice Price.
 *  - If the element is unable to calculate the Margin %, a warning is added.
 *  - Thresholds:
 *      - This element compares the margin % against the thresholds for the given
 *          "ProductGroup". The thresholds are defined in the Price Parameter
 *          "MarginAlertThreshold".
 *      - The threshold are checked in the following order
 *          1. Critical alert
 *          2. Red Alert
 *          3. Yellow alert
 *          If the threshold exist and if the Margin % goes below the threshold, a
 *              corresponding alert is raised and the other thresholds are not checked.
 *      - If the calculation element is unable to look up the thresholds in the Price Parameter
 *          - A warning is raised.
 *          - The calculated margin % is returned.
 *      - If one or more thresholds are not defined, they are simply skipped.
 */

// Calculate the Margin %

// FIXME START

// FIXME END

// Check Thresholds

// FIXME START

// FIXME END

// Find the alert thresholds

// FIXME START

// FIXME END

// Raise alerts based on the thresholds

// FIXME START

// FIXME END