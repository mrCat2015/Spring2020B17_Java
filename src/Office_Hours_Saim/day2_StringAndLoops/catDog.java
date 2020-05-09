package Office_Hours_Saim.day2_StringAndLoops;
/*

Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

public class catDog {
    public static void main(String[] args) {
        String str = "dogdogcat";
        int countCat = 0;
        int countDog = 0;
        boolean result;

        for(int i = 0; i<str.length(); i++){
            if(str.contains("cat")){
                str = str.replaceFirst("cat", "");
                countCat++;
            }if(str.contains("dog")){
                str = str.replaceFirst("dog", "");
                countDog++;
            }

        }

        if(countCat == countDog){
            result = true;

        }else{
            result = false;
        }

        System.out.println(result);


    }
}
