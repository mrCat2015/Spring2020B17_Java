package day39_AccessModifiers;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Rustam");
        System.out.println(employee1);

        Employee employee2 = new Employee("Marina", "Tester");
        System.out.println(employee2);

        Employee employee3 = new Employee("Muhtar", "Mechanic", 12358);
        System.out.println(employee3);

        Employee employee4 = new Employee("Saban", "SDET", 12396, 105000);
        System.out.println(employee4);

        Employee employee5 = new Employee("Nigina", "Automation Teater", 12374, 110000, 'F');
        System.out.println(employee5);


    }



}
