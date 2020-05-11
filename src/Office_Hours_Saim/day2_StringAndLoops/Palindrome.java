package Office_Hours_Saim.day2_StringAndLoops;

public class Palindrome {
    public static boolean isPalindrome(String str) {

        String reverse = "";
        boolean result = true;
        for(int i = str.length()-1; i>=0; i--){
            reverse += ""+ str.charAt(i);
            if(str.equalsIgnoreCase(reverse)){
                result = true;
            }else{
                result = false;
            }

        }
        System.out.println(result);



        return result;

    }

    public static void main(String[] args) {

        isPalindrome("level");
        isPalindrome("mark");


    }




}
