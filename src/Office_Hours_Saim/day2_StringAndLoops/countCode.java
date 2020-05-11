package Office_Hours_Saim.day2_StringAndLoops;
/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

public class countCode {
    public static void main(String[] args) {
        String str = "cozexxcope";
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.contains("code") || (str.contains("coze")) || (str.contains("cope"))){
                str = str.replaceFirst("code", "");
             //   str = str.replaceFirst("cope", "");
             //   str = str.replaceFirst("coze", "");

                count++;
            }


        }

        System.out.println(count);
    }
}
