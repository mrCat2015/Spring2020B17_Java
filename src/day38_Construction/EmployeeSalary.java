package day38_Construction;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryCalculator zareen = new SalaryCalculator(50, 40, 0.085, 0.2);
        System.out.println(zareen.salary());
        System.out.println(zareen.salaryAfterTax());
        System.out.println(zareen);

        SalaryCalculator Marina = new SalaryCalculator(62, 40, 0.075, 0.2);
        System.out.println("===========================");
        System.out.println(Marina);

    }
}
