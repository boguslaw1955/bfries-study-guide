/**
 * User Story:
 * As a Sales Manager, I need to have an approval flow for the Quote, to be able to catch problems with profitability.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element builds a Map named "steps", which contains the approval steps with information about Reasons,
 *    why we are adding Approvers
 * - list of Steps is provided by Pricing Manager in the Price Parameter table "FoodWorkflowSteps"
 * - list of Margin Pct Thresholds is provided by Pricing Manager in the Price Parameter table "FoodWorkflowConditions"
 * - the Map, when built, has the following structure:
 *      StepID :
 *          StepLabel : label of the step, to be used as the Step name
 *          StepType : either WATCHER or APPROVER
 *          ApproverType : either GROUP or USER
 *          MinApprovers : how many approvers has to approve, so that the step is approved (optional value, can be empty)
 *          Approvers :
 *                <approver_name> : [list of reasons]
 */

// FIXME START

// FIXME END

// iterate through all Quote Lines and check if there's a reason for approval

// FIXME START

// FIXME END