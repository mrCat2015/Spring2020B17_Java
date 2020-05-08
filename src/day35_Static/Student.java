package day35_Static;

public class Student {
    String name;
    int id;
    double gpa;
    static String SchoolName = "Cybertek";

    public void setInfo(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;


    }
    public static void printSchoolName(){
        System.out.println(SchoolName);
    }

    public String toString(){
        return "School name "+SchoolName+"\nStudent name: "+name+"\nStudent ID: "+id+"\nStudent GPA: "+gpa;
    }

}
