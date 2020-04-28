package replIt;

import java.util.Scanner;
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */

public class TipCalculator_051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        String split = input.next();
        System.out.println("Number of people:");
        int number = input.nextInt();
        System.out.println("Check amount:");
        double amount = input.nextDouble();
        System.out.println("Service Quality:");
        String service = input.next();

        double tipPercent = service.equalsIgnoreCase("poor")? 0.05 :
                service.equalsIgnoreCase("fair")? 0.10 :
                        service.equalsIgnoreCase("good")? 0.15 :
                                service.equalsIgnoreCase("great")? 0.20 :
                                        service.equalsIgnoreCase("excellent")? 0.25 : 0;



        double totalTip = amount * tipPercent;
        double totalPay = amount + totalTip;
        double totalPerPerson = totalPay / number;
        double tipPerPerson = totalTip/number;
        String numberOfPeople = "";

        if(number > 1 && number < 6 && split.equalsIgnoreCase("yes")){
            if(number == 2){
                numberOfPeople = "&&";
            }else if(number == 3){
                numberOfPeople = "&&&";
            }else if(number == 4){
                numberOfPeople = "&&&&";
            }else if(number == 5){
                numberOfPeople = "&&&&&";
            }

        }else{
            System.out.println("");
        }

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);

        }

    }

