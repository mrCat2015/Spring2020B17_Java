package Office_Hours_Saim.day2_StringAndLoops;
/*
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2

 */

public class countHi {
    public static void main(String[] args) {
        String str = "abc hi ho";
        int count = 0;


        for(int i = 0; i < str.length(); i++){
            if(str.contains("hi")){
                str = str.replaceFirst("hi", "");
                count++;


            }
        }

        System.out.println(count);

    }
}
