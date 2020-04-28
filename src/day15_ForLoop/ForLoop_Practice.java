package day15_ForLoop;

public class ForLoop_Practice {
    /*
    odd number between 0 ~ 100 in a single line separated by a space
     */

    public static void main(String[] args) {

        String resultOdd = "";

        for(int number = 1; number < 101; number +=2 ){
         //   System.out.print(number + " ");
            resultOdd += number+" "; // result = result + " ";


        }

        System.out.println(resultOdd);

        String resultEven = "";
        for(int number = 2; number <101; number +=2){
            resultEven = number + " ";
            System.out.print(resultEven);

        }

    }

}
