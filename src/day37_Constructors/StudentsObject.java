package day37_Constructors;

public class StudentsObject {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", 19, 'M', "Life University");
      //  student1.setInfo("Marina", 34, 'F', "Cybertek");
        System.out.println(student1);

        Student student2 = new Student("Dinara", 23,'F',"Stanford");
        System.out.println(student2);



    }
}
