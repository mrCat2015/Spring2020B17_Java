package day42_Inheritance.Task01;

public class Student extends Person {
    /*
    /*
    public String name;
    public int age;
    public char gender;

    public void eat()
    public void walk()
    public void sleep


     */

    public long studentID;
    public String clazz;
    static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        setPersonaInfo(name, age, gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }
    public void code(){
        System.out.println(name + " is coding");
    }

    public String toString(){
        return "Name: "+name+", School Name: "+schoolName +", Student ID" + studentID+", Age: "+age+", Gender: "+gender;
    }


}
