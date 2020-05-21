package day41_Inheritance;

public class businessAnalyst extends Employee {
    /*
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString()
     */
    public businessAnalyst(double salary, String name, long id, char gender){
        this.salary = salary;
        this.name = name;
        this.id = id;
        jobTitle = "Business Analyst";
        this.gender = gender;

    }

    public void writingRequirement(){
        System.out.println(name + " is writing requirement");

    }
    public void gathering(){
        System.out.println(name + " is gathering requirement");
    }

}
