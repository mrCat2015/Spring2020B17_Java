package day41_Inheritance;

public class Tester extends Employee {
    /*
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString()
     */

        public Tester(double salary, String name, long id, String jobTitle, char gender){
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;

    }
    public void reportingBug(){
        System.out.println(name + " reporting bug");
    }

    public void testing(){
        System.out.println(name + " testing");
    }


}
