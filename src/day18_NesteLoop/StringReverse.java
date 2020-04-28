package day18_NesteLoop;

public class StringReverse {
    public static void main(String[] args) {
        String str = "ALIECE";

        String reverse = "";

        int lastIndex = str.length()-1;

        do{

            reverse += str.charAt(lastIndex);
            lastIndex--;



        }while(lastIndex >=0);

        System.out.println(reverse);
    }
}
