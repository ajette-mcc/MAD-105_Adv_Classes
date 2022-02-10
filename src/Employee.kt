import java.text.DecimalFormat

class Employee(
    var name: String,
    var position: PositionTitle,
    var salaried: Boolean,
    var payrate: Double,
    var shift: Int) {


// Function to calculate pay based on their hours worked and the shift
fun caclulatePay(hoursIn: Double): Double {
    var salary: Double                      // Calculated Salary
    var shiftPremium: Double = 1.00         // Shift Premium (5% more 2nd shift, 10% more 3rd shift)
    var overtimeBonus: Double = 0.00        // Hourly employees get paid 50% extra for OT (>40 hrs/week)
    var hoursPaid: Double = 40.00           // Salaried employees are pd for 40 hrs/wk, regardless of hours worked
    val dispMoney = DecimalFormat("$###,###.00")    // Way to format money

    // shiftPremium = 1.05 for 2nd shift and 1.10 for 3rd shift
    if (this.shift == 2) shiftPremium = 1.05
    else if (this.shift == 3) shiftPremium = 1.10

    // if salaried, fix hoursIn at 40 regardless; otherwise, hoursPaid = # hours worked (hoursIn)
    if (this.salaried == false) hoursPaid = hoursIn

    // if not salaried, pay OT hours at 1.5 normal rate.  Here overTimeBonus for the extra 50% for the # hours worked
    if (this.salaried == false && hoursIn > 40) overtimeBonus = (hoursIn - 40.00) * this.payrate * 0.5

    // Calculate salary, print applicable employee information for this week and return the weekly salary
    salary = ((this.payrate * hoursPaid) + overtimeBonus) * shiftPremium
    println(name)
    println("  Position: " +this.position.PrintedTitle + "     Salaried: " +salaried + "    Shift: " + shift)
    println("  Payrate per Hr:  " +dispMoney.format(payrate))
    println("  This weeks salary: " +dispMoney.format(salary))
    return salary
}

}