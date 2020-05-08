package day35_Static;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Marina";
        student1.id = 258;
        student1.gpa = 4.0;
        System.out.println(student1);



        Student student2 = new Student();
        student2.name = "Vasilina";
        student2.id = 369;
        student2.gpa = 4.1;
        System.out.println(student2);


        Student student3 = new Student();
        student3.name = "Mark";
        student3.id = 147;
        student3.gpa = 3.9;
        System.out.println(student3);

        Student.printSchoolName();





    }



}
