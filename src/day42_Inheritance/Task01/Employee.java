package day42_Inheritance.Task01;

public class Employee extends Person{
    /*
    public String name;
    public int age;
    public char gender;

    public void eat()
    public void walk()
    public void sleep
     */
    double salary;
    long employeesID;
    String jobTitle;

    public void setEmployeesIDInfo(String name, int age, char gender, double salary, long employeesID, String jobTitle){
        setPersonaInfo(name, age, gender);
        this.salary = salary;
        this.employeesID = employeesID;
        this.jobTitle = jobTitle;

    }
    public void work(){
        System.out.println(name+" is working");
    }
    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", Salary: "+salary;
    }


}
