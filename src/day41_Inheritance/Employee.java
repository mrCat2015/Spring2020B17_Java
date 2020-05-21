package day41_Inheritance;

public class Employee {
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Name: "+name + ", Job Title: "+jobTitle+", ID: "+
                id+", Gender: "+gender+", Salary: "+salary;
    }
}
