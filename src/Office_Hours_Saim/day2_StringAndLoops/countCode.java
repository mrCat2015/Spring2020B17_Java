package Office_Hours_Saim.day2_StringAndLoops;
/*
Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

public class countCode {
    public static void main(String[] args) {
        String str = "cozexxcope";
        int count = 0;

        for(int i = 0; i < str.length()-3; i++){
            if(str.substring(i, i+2).equals("co") && str.substring(i+3, i+4).equals("e")){
               // if(str.charAt(i)) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e')
             //   str = str.replaceFirst("code", "");
                count++;
            }


        }

        System.out.println(count);
    }
}
