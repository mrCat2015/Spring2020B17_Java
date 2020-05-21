package day41_Inheritance;

public class Developer extends Employee {
    /*
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString()
     */
    public Developer(double salary, String name, long id, String jobTitle, char gender){
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;

    }

    public void fixingBug(){
        System.out.println(name + " is fixing the bug");
    }
    public void coding(){
        System.out.println(name + " coding");
    }

}
