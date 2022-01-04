List<Filter> buildFilters(includeSalesperson = true) {
    List<Filter> filters = []
    if (out.DateFrom) {
        filters << Filter.greaterOrEqual("ValidAfter", out.DateFrom)
    }
    if (out.DateTo) {
        filters << Filter.lessThan("ValidAfter", out.DateTo)
    }
    if (includeSalesperson) {
        if (out.Salesperson) {
            filters << Filter.equal("SalespersonUsername", out.Salesperson)
        }
    }
    return filters
}