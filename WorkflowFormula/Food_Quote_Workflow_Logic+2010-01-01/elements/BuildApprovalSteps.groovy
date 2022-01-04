/**
 * User Story:
 * As a Sales Manager, I need to have an approval flow for the Quote, to be able to catch problems with profitability.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element adds the Approval or Watcher steps to the workflow
 * - we need to use all the information collected in the previous element "CollectReasons", provided as map with following info:
 *       - StepLabel
 *       - StepType (WATCHER / APPROVER)
 *       - ApproverType (GROUP / USER)
 *       - MinApprover - use the number only when it's defined. Makes sense only for Approval Step.
 *       - Approvers - map, where:
 *                            - the key is the approver/watcher name (either login or group unique name)
 *                            - the value is list of reasons, why this approver has to approve
 */

// FIXME START

// FIXME END

// ====== Helper methods =======

/**
 * Adds to the workflow a new Watcher step, based on the provided definition.
 * @param step Map with information about the step
 * @return nothing
 */
def addWatcherStep(step) {
    def watcherStep = workflow.addWatcherStep(step.StepLabel)
    def watchers = [], reasons = []
    step.Approvers.each { watcher ->
        watchers << watcher.key
        reasons << watcher.value.join(", ")
    }
    // To the watcher step, add either users or (user) groups.
    // Throw exception if the watcher type is unknown
    switch (step.ApproverType) {
        case "GROUP":
            watcherStep.withUserGroupWatchers(*watchers)
            break
        case "USER":
            watcherStep.withUserWatchers(*watchers)
            break
        default:
            api.throwException("Found unknown Approver Type: '${step.ApproverType}'")
    }
    watcherStep.withReasons(*reasons)
}

/**
 * Adds to the workflow a new Approval step, based on the provided definition.
 * @param step Map with information about the step
 * @return nothing
 */
def addApprovalStep(step) {
    def approvalStep = workflow.addApprovalStep(step.StepLabel)
    def approvers = [], reasons = []
    step.Approvers.each { approver ->
        approvers << approver.key
        reasons << approver.value.join(", ")
    }
    // To the approval step, add either users or (user) groups.
    // Throw exception if the approver type is unknown
    switch (step.ApproverType) {
        case "GROUP":
            approvalStep.withUserGroupApprovers(*approvers)
            break
        case "USER":
            approvalStep.withApprovers(*approvers)
            break
        default:
            api.throwException("Found unknown Approver Type: '${step.ApproverType}'")
    }
    approvalStep.withReasons(*reasons)
    if (step.MinApprovers) approvalStep.withMinApprovalsNeeded(step.MinApprovers)
}

