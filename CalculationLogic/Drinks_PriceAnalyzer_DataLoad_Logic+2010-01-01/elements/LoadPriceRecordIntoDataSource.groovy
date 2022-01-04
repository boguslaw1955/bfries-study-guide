/**
 * User Story:
 * - As a Pricing Analyst, I need to be able to analyze closed deals with charts
 *      in the Price Analyzer module.
 *
 * Details:
 * - The source data is located in the PriceRecord table.
 * - The price records may belong to any Quote Type / Implementation / Business Unit.
 * - The logic is used in a calculation data load where the target table is the
 *      "Drinks_PriceRecord" Data Source table.
 *
 * Acceptance Criteria:
 * - The logic copies price records from the PriceRecord table into the target
 *      Data Source table
 * - From the price records table, only copy lines where the the product's
 *      "BusinessUnit" equals "Drinks".
 * - The following data should be copied over into the target Data Source table:
 *      - TypedId (a unique key is needed in the DS)
 *      - CustomerId
 *      - CustomerName
 *      - InvoiceName
 *      - CountryCode
 *      - ValidAfter
 *      - ExpiryDate
 *      - DeliveryType
 *      - IncludeTaxes
 *      - ProductId
 *      - Quantity
 *      - InvoicePrice
 *      - Currency
 *      - SalespersonUsername
 */

// FIXME START

// FIXME END

// ========= Helper methods =========

def buildTargetRow(Map priceRecord){
    return [
            TypedId           : priceRecord.typedId,
            CustomerId        : priceRecord.customerId,
            CustomerName      : priceRecord.attribute4,
            InvoiceName       : priceRecord.attribute9,
            CountryCode       : priceRecord.attribute5,
            ValidAfter        : priceRecord.validAfter,
            ExpiryDate        : priceRecord.expiryDate,
            DeliveryType      : priceRecord.attribute6,
            IncludeTaxes      : priceRecord.attribute7 == "true",
            ProductId         : priceRecord.sku,
            Quantity          : priceRecord.attribute2,
            InvoicePrice      : priceRecord.attribute1,
            Currency          : priceRecord.attribute8,
            SalespersonUsername: priceRecord.attribute3,
    ]
}

