package day24_Methods;

import java.util.Scanner;



public class birthyear {
    public static void main(String[] args) {
        int a = 2002;
        Age(2020);

        printHelloCybertek();
    }



    public static void Age(int birthYear){ //2000
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if(birthYear <= currentYear && birthYear > 1990){
            System.out.println(age);
        }else{
            System.out.println("Invalid birth year");
        }




    }
    public static void printHello(){
        System.out.println("Hello");


    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }

    public static void printHelloCybertek(){
        printHello(); //Hello
        printCybertek(); //Cybertek

    }



}
