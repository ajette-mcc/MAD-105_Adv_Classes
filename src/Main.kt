// MAD-105 Advanced Classes Assignment due 21-Feb-2022

fun main()  {
        // Define 3 employees per Employee Construct
        var emp1 = Employee("Jane Doe", PositionTitle.ADIMINISTRATION ,true, 27.00, 1 )
        var emp2 = Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2)
        var emp3 = Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.0, 3)

        // Calculate Pay for 3 employees and print their information for the week
        emp1.caclulatePay(45.00)
        emp2.caclulatePay(50.00)
        emp3.caclulatePay(35.00)
}