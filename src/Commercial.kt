class Commercial (
    propertyName: String,
    commercialRate: Double,
    multipleProperty: Int,
    customerName: String,                // customer name through square footage inherited from Customer Class
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double):
    Customer(customerName, customerPhone, customerAddress, squareFootage) {

    // Getters and Setters
    var propertyName: String = ""
    get() = field
    set(value) {field=value}

    var commercialRate: Double = 5.00
    get() = field
    set(value) {field=value}

    var multipleProperty: Int = 1
    get() = field
    set(value) {field=value}

    init {
        println("New Commercial Customer $customerName")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.propertyName = propertyName
        this.commercialRate = commercialRate
        this.multipleProperty = multipleProperty
    }

    // Function to calculate cost of weekly lawn maintenance and display
    fun calculate(): Double {
        var weeklyCost: Double = this.squareFootage * this.commercialRate

        println("Business Customer Contact: ${this.customerName}")
        println("  Business Name: ${this.propertyName}")
        println("  Address: ${this.customerAddress}    Phone: ${this.customerPhone}")
        println("  Square Footage: ${this.squareFootage},  Number of Properties: ${this.multipleProperty}")
        println("  Weekly Maintenance cost: " +weeklyCost)
        println()
        return weeklyCost
    }
}