package day39_AccessModifiers;
/*
    2. create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
     */
public class Employee {
    String name;
    String jobtitle;
    long id;
    double salary;
    char gender;
    static String companyName = "BoA";

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, String jobtitle){
        this(name);
        this.jobtitle = jobtitle;

    }
    public Employee(String name, String jobtitle, long id){
        this(name, jobtitle);
        this.id = id;

    }
    public Employee(String name, String jobtitle, long id, double salary){
        this(name, jobtitle, id);
        this.salary = salary;

    }
    public Employee(String name, String jobtitle, long id, double salary, char gender){
        this(name, jobtitle, id, salary);
        this.gender = gender;

    }


    public String toString(){
        return "Name: "+name+
                " Job Title: "+jobtitle+
                " Company Name: "+companyName+
                " ID: "+id+
                " Salary: "+salary+
                " Gender: "+gender;

    }
}



