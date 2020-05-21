package day41_Inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer develop1 = new Developer(125000, "Mike Manella", 125589, "Developer", 'M');
        develop1.fixingBug();
        develop1.coding();
        System.out.println(develop1);


        Tester tester1 = new Tester(105000, "Omara Lee", 1236589, "SDET", 'F');
        tester1.reportingBug();
        tester1.testing();
        System.out.println(tester1);

        businessAnalyst BA1 = new businessAnalyst(156000, "Ozgur", 125697,  'M' );
        BA1.writingRequirement();
        BA1.gathering();
        System.out.println(BA1);


    }
}
