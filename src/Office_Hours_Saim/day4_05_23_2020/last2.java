package Office_Hours_Saim.day4_05_23_2020;
/*

Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */

public class last2 {
    public static void main(String[] args) {
        String str = "hixxhi";
        int count = 0;

        if(str.length()< 2){
            count = 0;
        }
        String end = str.substring(str.length()-2);
       // System.out.println(end);

        for(int i = 0; i < str.length()-2; i++){
            String sub = str.substring(i, i+2);
            if(sub.equals(end)){
                count++;
            }
        }
        System.out.println(count);

    }

}
