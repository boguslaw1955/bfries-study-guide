/**
 * This element will not have any code breaks in the exam.
 *
 * User Story:
 *  - As a Sales Person I need to View a comparison with competitors (if data is
 *      available).
 *  - KPIs are Competitor Median Price and Lowest Competitor Price.
 *
 * Acceptance Criteria / Implementation Details:
 * - This element calculates and returns the median of the competitor prices,
 *      retrieved by the element "CompetitorPrices".
 *  - If there is no competition data, the element returns null.
 */


BigDecimal median(List<BigDecimal> numbers) {
    if (!numbers) {
        return null
    }

    numbers.sort()
    int middle = numbers.size() / 2

    if (numbers.size() % 2 == 1) {
        // Odd number of elements -> return the element in the middle
        return numbers[middle]
    } else {
        // Even number of elements -> return the average price of the two elements in the middle
        return (numbers[middle - 1] + numbers[middle]) / 2.0
    }
}

return median(out.CompetitorPrices?.collect { it.price })