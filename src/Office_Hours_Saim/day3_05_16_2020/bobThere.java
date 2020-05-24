package Office_Hours_Saim.day3_05_16_2020;
/*

Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */

public class bobThere {
    public static void main(String[] args) {
        String str = "123abcbcdbabxyz";
        boolean res = false;

        for(int i = 0; i < str.length()-2; i++){
            String result = str.substring(i,i+3);

             if((result.charAt(0) == 'b') && (result.charAt(2) == 'b')) {
                 res = true;
                 break;
             }else{
                 res = false;
             }

        }
        System.out.println(res);
    }
}
