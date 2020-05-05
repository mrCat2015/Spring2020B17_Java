package day34_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Marina", "Russain", 35, 3.5, 'F', true);
        System.out.println(student1);

        Student student2 = new Student();
        student2.setStudentInfo("Nigina Berdieva", "German", 26, 4.0, 'F', true);

        Student student3 = new Student();
        student3.setStudentInfo("Vasilina", "USA", 35, 3.4, 'F', true);

        Student student4 = new Student();
        student4.setStudentInfo("Mike", "England", 40, 2.5, 'M', false);

        Student [] students = {student1, student2, student3, student4};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));

        canGraduate.removeIf(p ->p.gpa <=3.0);

        System.out.println(canGraduate.size());

        for(int i = 0; i<canGraduate.size(); i++){
            Student each = canGraduate.get(i);
            System.out.println(each.name + " can graduate");
        }

        System.out.println("=============================");

        ArrayList<Student> canNotGraduate = new ArrayList<>(Arrays.asList(students));
        canNotGraduate.removeIf(p -> p.gpa > 3.0);
        System.out.println(canNotGraduate.size());

        for(Student each: canNotGraduate){
            System.out.println(each.name);
        }







    }
}
