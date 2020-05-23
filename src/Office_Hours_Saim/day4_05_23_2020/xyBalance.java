package Office_Hours_Saim.day4_05_23_2020;
/*

We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

public class xyBalance {
    public static void main(String[] args) {
        String str = "aaxbby";
        boolean result = false;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x'){
                if(str.substring(i).contains("y")){
                    result = true;
                }
            }
        }
        System.out.println(result);

    }
}
