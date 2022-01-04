/**
 * This element will not have any code breaks in the exam.
 */
/**
 * Acceptance Criteria / Implementation Details:
 * - avoid further execution during Syntax Check mode
 */


if(api.isSyntaxCheck()){
    api.abortCalculation()
}