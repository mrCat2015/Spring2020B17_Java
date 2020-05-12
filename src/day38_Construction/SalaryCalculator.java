package day38_Construction;
/*
Task03:
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public Double salary(){
        return hourlyRate * weeklyHours * 48;
    }

    public Double salaryAftertax(){
        return salary() - stateTax() - federalTax();
    }

    public Double stateTax(){
        return salary() * stateTaxRate;
    }
    public Double federalTax(){
        return salary() * federalTaxRate;

    }
    public String toString(){
        return "Hourly Rate: "+hourlyRate+"\nWeekly Hours: "+weeklyHours+
                "\nSalary: $"+salary();

    }

}
