package OfficeHours.Practice_05_06_2020;
/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
create a class called ScrumTeam
			Attributes:
				name
				List of Testers,
				List of Developers,
			Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp
crteate a class called BankofAmerica:
				Bank of America in VA is p-lanning to create a scrum teams:
						4 developers 2 testers
				 create a arraylist of scrum team and:
						 1. use the for loop to print out every single employees from BOA' scrum teams
						 2. calculate the total budgets of the screumteam
 */

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employId;

    public void setInfo(String name, String jobTitle, double salary, long employId){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employId = employId;


    }
    public String toString(){
        return "Name: "+name+ ", job title: "+jobTitle + ", salary: $"+salary+", ID: "+employId;
    }

    public void smokeTesting(){
        int name = 100;
        System.out.println(this.name + " is doing smoke test");

    }
    public void creatingTicket(){
        System.out.println(this.name + " is creating tickets on Jira");

    }


}
