class Residential (
    residentialRate: Double,
    senior: Boolean,
    customerName: String,                // customer name through square footage inherited from Customer Class
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double):
    Customer(customerName,customerPhone, customerAddress, squareFootage) {

    // Getters and Setters
    var residentialRate: Double = 6.00
    get() = field
    set(value) {field=value}

    var senior: Boolean = false
    get() = field
    set(value) {field=value}

    init {
        println("New Residential Customer $customerName")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.residentialRate = residentialRate
        this.senior = senior
    }

    // Function to calculate cost of weekly lawn maintenance and display
    fun calculate(): Double {
        var seniorDiscount: Double = 1.00
        if (this.senior == true) seniorDiscount = 0.85

        var weeklyCost: Double = this.squareFootage * this.residentialRate * seniorDiscount

        println("Customer ${this.customerName}")
        println("  Address: ${this.customerAddress}    Phone: ${this.customerPhone}")
        println("  Square Footage: ${this.squareFootage},  Senior Discount: ${this.senior}")
        println("  Weekly Maintenance cost: " +weeklyCost)
        println()

        return weeklyCost
    }
}