/**
 * This logic element will NOT contain any code breaks.
 */

/**
 * User Story:
 * - As a Sales Manager, I need to be able to visualize the performance of the
 *      salespersons over time and compare their sales against the average
 *      performance.
 *
 * Acceptance Criteria / Implementation Details:
 *  - this elements builds a Column Chart, using the High Charts
 *  - a column represents average amount of total sales in one month. The average is calculated per Sales Rep.
 *  - X axis - represents months
 *  - Y axis - total sales (in EUR) per month
 */



def series = [
        [
                name: 'Average Total Sales per Sales Rep',
                data: out.SalespersonPerformanceData.averageSales

        ]
]
if (out.Salesperson) {
    series << [
            name: out.Salesperson,
            data: out.SalespersonPerformanceData.salespersonSales
    ]
}
def highchartDefinition = [
        chart      : [
                type: 'column'
        ],
        title      : [
                text: out.Salesperson ? "Monthly Performance of ${out.Salesperson} " : "Monthly Average Performance per SalesRep"
        ],
        xAxis      : [
                categories: out.SalespersonPerformanceData.months,
                crosshair : true
        ],
        yAxis      : [
                min  : 0,
                title: [
                        text: 'Sales (€)'
                ]
        ],
        tooltip    : [
                headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
                pointFormat : '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                        '<td style="padding:0"><b>{point.y:.1f} €</b></td></tr>',
                footerFormat: '</table>',
                shared      : true,
                useHTML     : true
        ],
        plotOptions: [
                column: [
                        pointPadding: 0.2,
                        borderWidth : 0
                ]
        ],
        series     : series
]
return api.buildHighchart(highchartDefinition)
        .showDataTab() //   - Adds a data tab to the chart