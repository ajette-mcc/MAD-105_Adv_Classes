// MAD-105 Inheritance Assignment due 28-Feb-2022

fun main() {
        // Define current rates (fixed values) and customer(s)
        val currentCommercialRate: Double = 5.00
        val currentResidentialRate:Double = 6.00
        var cust1 = Customer("Jane", "555-Cust1", "1 Cust Street", 1000.00)
        var cust2 = Commercial("Menards", currentCommercialRate, 3, "Bill", "555-Cust2", "2 Cust St", 2000.00)
        var cust3 = Residential(currentResidentialRate, senior = true, "Fred", "555-Cust3", "3 Cust St", 3000.00)
        var cust4 = Residential(currentResidentialRate, senior = false, "Barney", "555-Cust4", "4 Cust St", 3000.00)

        // Other variables in main
        var quote: Double = 0.00

        cust2.calculate()
        cust3.calculate()
        quote = cust4.calculate()

        println("Quote for ${cust4.customerName} is:  ${quote}   " + quote)
}