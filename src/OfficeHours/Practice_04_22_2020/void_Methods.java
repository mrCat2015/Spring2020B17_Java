package OfficeHours.Practice_04_22_2020;

public class void_Methods {
    public static void print(){
        for(int i = 1; i <=5; i++){
            System.out.println("Hello B18");
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println("===============================");

        Vote(21, true);
        System.out.println("===============================");

        Smoke(28);


    }
    public static void Vote(int age, boolean USCitizen){
        boolean eligibleToVote = age >= 18 && USCitizen == true;

        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }

    }
    public static void Smoke(int age){
        if(age > 18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("not eligible to buy");
        }
    }

}
