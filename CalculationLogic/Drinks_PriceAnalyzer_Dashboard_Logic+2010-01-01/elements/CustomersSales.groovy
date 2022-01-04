import com.google.common.collect.BoundType

/**
 * This logic element will NOT contain any code breaks.
 */
/**
 * User Story:
 * - As a Sales Manager, I need to be able to visually compare the performance of the Quotes issued to
 *     the "individuals" (i.e. physical persons) versus the companies
 *
 * Acceptance Criteria / Implementation Details:
 * - this element creates a pie chart, where the slices represents total sales of customers
 * - data are available as output of element CustomerSalesData
 */


def highchartDefinition = [
        chart        : [
                plotBackgroundColor: null,
                plotBorderWidth    : null,
                plotShadow         : false,
                type               : 'pie'
        ],
        title        : [
                text: 'Sales per Customer/Type of Customer'
        ],
        subtitle     : [
                text: "Total Sales" + (out.Salesperson ? " for ${out.Salesperson}" : "") + ": ${out.TotalSales}€"
        ],
        tooltip      : [
                headerFormat: '',
                pointFormat : '<span style="color:{point.color}">\u25CF</span> <b> {point.name}</b><br/>' +
                        'Sales: <b>{point.y}€</b><br/>' +
                        'Share: <b>{point.percentage:.1f}%</b><br/>'
        ],
        accessibility: [
                point: [
                        valueSuffix: '€'
                ]
        ],
        plotOptions  : [
                pie: [
                        allowPointSelect: true,
                        cursor          : 'pointer',
                        dataLabels      : [
                                enabled: true,
                                format : '<b>{point.name}</b>: {point.y:.0f}€'
                        ]
                ]
        ],
        series       : [[
                                name        : 'Customer Sales',
                                colorByPoint: true,
                                data        : out.CustomerSalesData
                        ]]
]

return api.buildHighchart(highchartDefinition)
        .showDataTab() //   - Adds a data tab to the chart
        .setDataHeaders('Country', 'Revenue', 'Margin')