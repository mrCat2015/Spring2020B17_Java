package Task.Polimorphism;
/*
create a class named CybertekSchool
            create 5 objects of students and set your classmates' info
            create a list of Cybertek and store all student objects
            iterate the list to display the full information of students
 */

import java.util.ArrayList;
import java.util.Arrays;


public class CybertekSchool {
    public static void main(String[] args) {
        Student student1 = new Student("Mark", 18, 'A', true);
        Student student2 = new Student("Martin", 24, 'A', true);
        Student student3 = new Student("Anna", 19, 'A', false);
        Student student4 = new Student("Alice", 23, 'A', false);
        Student student5 = new Student("Ivan", 22, 'A', true);

        ArrayList<Student>list = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4, student5));
        System.out.println(list);


    }
}
