/**
 * User Story:
 * As a Sales Person, I want to calculate a Freight Surcharge being applied, when we will ship the product quantities negotiated in the Quote.
 *
 * Acceptance Criteria / Implementation Details:
 * - this element calculates and displays the Freight Surcharge on the Quote Header results
 * - The FreightSurcharge result:
 *      - FreightSurcharge = StartCost  +  TotalWeight * CostPerKg
 *      - calculated in the currency found in Price Parameter table "DeliveryCost"
 *      - is formatted as Money with currency suffix
 * - StartCost, CostPerKg - can be found in Price Parameter table "DeliveryCost", based on 1)FROM & 2)TO country and 3)Delivery Type
 * - as always - the user should be warned about all problems, which prevents the calculation of the Freight Surcharge
 *
 */

// FIXME START

// FIXME END

//by now, all products shipped from DE (Germany)

// FIXME START

// FIXME END

// Values of properties in the output

// FIXME START

// FIXME END

// Read inputs and outputs for which the delivery cost if dependent

// FIXME START

// FIXME END

// Check that Customer, Delivery Type & TotalWeight are present

// FIXME START

// FIXME END

// Look up Delivery cost

// FIXME START

// FIXME END

// Delivery cost lookup success

// FIXME START

// FIXME END

// Calculate Delivery Cost

// FIXME START

// FIXME END

//------------------------- functions --------------------------------------
void addFreightSurchargeOutput(String warning) {
    addFreightSurchargeOutput(null, null, warning)
}

/**
 * Adds or updates output for the freight surcharge to the quote header outputs
 * @param result the freight surcharge
 * @param currency the currency of the <code>result</code>
 * @param warning
 */
void addFreightSurchargeOutput(BigDecimal result, String currency, String warning = null) {
    def output = [
            "resultName" : "FreightSurcharge",
            "resultLabel": "Freight Surcharge",
            "result"     : result,
            "formatType" : FieldFormatType.MONEY,
            "resultType" : CalculationResultType.SIMPLE,
            "suffix"     : currency,
    ]
    if (warning) {
        // Only add the warnings property if the array of warnings is not empty
        output.warnings = [warning]
    }
    quoteProcessor.addOrUpdateOutput(output)
}