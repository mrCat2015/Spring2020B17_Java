package day25_Methods;
import Resources.Library;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBCC"; //A2B2C2
        //ABC

        String nonDup = Library.RemoveDuplicates(str);
        System.out.println(nonDup);
        String result = "";


        for (int i = 0; i < nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i); //A
            int num = Library.Frequency(str, ch);

           // System.out.print(ch + num);
            result += ch + num;

        }
        System.out.println(result);

    }
    public static String FrequencyOfChars(String str){
        String nonDup = Library.RemoveDuplicates(str);
        System.out.println(nonDup);
        String result = "";


        for (int i = 0; i < nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i); //A
            int num = Library.Frequency(str, ch);

            // System.out.print(ch + num);
            result += ch + num;

        }
        return result;


    }
}
