package Interview_Questions;
/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class freq {
    public static void main(String[] args) {

       String str1 = frequecyOfChar("AAABBCDD");
        System.out.println(str1);

    }

    public static String frequecyOfChar(String str) {

        String nonDupl = ""; //ABCD
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nonDupl.contains("" + str.charAt(i))) {
                nonDupl += str.charAt(i);
            }
            for(int k = 0; k < result.length(); k++){
                int count = 0;
                for(int j = 0; j < str.length(); j++){
                    if(nonDupl.charAt(k) == str.charAt(j)){
                        count++;
                    }
                    result += nonDupl.charAt(k)+""+count;

                }
            }

        }
        return result;


    }
}
