package OfficeHours.Practice_05_06_2020;

public class Developer {
    String name;
    String jobTitle;
    double salary;
    long employId;

    public void setDeveloperInfo(String name, String jobTitle, double salary, long employId){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employId = employId;


    }
    public String toString(){
        return "Name: "+name+ ", job title: "+jobTitle + ", salary: $"+salary+", ID: "+employId;
    }

    public void coding(){
        System.out.println(name + " is coding");



    }
    public void fixingBugs(){
        System.out.println(name + " is fixing bugs");

    }
}
