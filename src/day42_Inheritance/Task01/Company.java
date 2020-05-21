package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;


public class Company {
    public static Employee empl1;
    public static Employee empl2;
    public static Employee empl3;

    static {
        empl1 = new Employee();
        empl1.setEmployeesIDInfo("Nabina", 26, 'F', 125000, 165879, "SDET");

        empl2 = new Employee();
        empl2.setEmployeesIDInfo("Kamila", 32, 'F', 110000, 154897, "Manual Tester");

        empl3 = new Employee();
        empl3.setEmployeesIDInfo("Barzy", 45, 'M', 115000, 153987, "Automation Tester");


    }

    public static void main(String[] args) {
        Employee [] list = {empl1, empl2, empl3};
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);


        }
    }
}
