package day49_Polymorphisim;
/*
task:
    1. create an abstract class named Employee:
            attributes: name, id, jobTitle, Salary,...
            abstract method: work()
    2. create class named Tester that inherits from emplyee
    3. create class named Developer that inherits from emplyee
    4. create a class named ScrumTeam:
            create an arraylist and store 3 testers and 4 developers
 */
public class ScrumTeam {
    public static void main(String[] args) {
        Employee tester1 = new Tester();
        Employee tester2 = new Tester();
        Employee tester3 = new Tester();

        Employee developer1 = new Developer();
        Employee developer2 = new Developer();
        Employee developer3 = new Developer();
        Employee developer4 = new Developer();

        Employee [] scrumTeam = {tester1, tester2, tester3, developer1, developer2, developer3, developer4};

    }
}
