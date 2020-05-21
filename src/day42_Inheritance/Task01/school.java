package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;



public class school {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Aliece", 7, 'F', 159678, "math");


        Student student2 = new Student();
        student2.setStudentInfo("Mark", 3, 'M', 147896, "english");


        Student student3 = new Student();
        student3.setStudentInfo("Arhan", 12, 'M', 169742, "music");

        ArrayList<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(student1, student2, student3));

        for(Student each: list){
           // System.out.println(each);
            System.out.println("Name: "+each.name + ", ID:" + each.studentID);

        }
    }

}
