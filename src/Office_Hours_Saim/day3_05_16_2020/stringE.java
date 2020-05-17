package Office_Hours_Saim.day3_05_16_2020;
/*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
         01234
stringE("Heelle") → true
stringE("Heelele") → false
 */

public class stringE {
    public static void main(String[] args) {
        String str = "Heelele";
                    //012345
        boolean result = true;
        int count = 0;

        while(str.contains("e")) {
            str.replaceFirst("e", "");
            count++;


        }


                result = count >= 1 && count <= 3;



        System.out.println(result);

    }
}
