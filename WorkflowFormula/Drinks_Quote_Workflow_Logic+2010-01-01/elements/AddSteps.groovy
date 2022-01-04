/**
 * User Story:
 *  As a Sales Manager, I want the quote document to undergo an approval process,
 *      to to ensure that the Quote is in line with the Business Rules.
 *
 * Acceptance Criteria / Implementation Details:
 *  - This element adds approval steps to the quote workflow, using the output from the
 *      "QuantityPerGroup" element and the thresholds and the approver groups
 *      defined in the Price Parameter "WorkflowApprovalLevels".
 *  - For each product group in the "QuantityPerGroup" element output, this
 *      calculation element checks whether the quantity exceeds the
 *      "QuantityThreshold" in the "WorkflowApprovalLevels" Price Parameter for
 *      that product group. If the threshold is exceeded, an approval step
 *      is added with the corresponding "ApprovalGroup" as Group Approver.
 *  - If there is more than one Approval Group in the same Approval Level, all
 *      those Approval Groups must be added to the same Approval step.
 *      Example:    Approval step   |   Group Approvers
 *                  ---------------------------------------------------------
 *                  1               |    SalesManagers, SalesManagersCocktail
 *                  2               |    CFO
 *  - The order of the approval steps are defined in the "ApprovalLevel" column
 *      in the Price Parameter "WorkflowApprovalLevels". (The steps with the lesser
 *      number comes before the steps with the greater numbers).
 */

// Fetch the rows from the Pricing Parameter table with the approval levels into
//  an array where each element corresponds to one row.
// Row sample: [ApprovalLevel: 2, ProductGroup: "Wine", QuantityThreshold: 12345, GroupApprover: "CEO"]

// FIXME START

// FIXME END

// Object that collects information about how the approval steps are to be built

// Check if the threshold is exceeded

// Initialize, if necessary

// Add approval group to the step

// FIXME START

// FIXME END


// Add approval steps

// FIXME START

// FIXME END

return

// ============= Helper methods =============

def insertUnique(array, value) {
    if (!array.contains(value)) {
        array << value
    }
}