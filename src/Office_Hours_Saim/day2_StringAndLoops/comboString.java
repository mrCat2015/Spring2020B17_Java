package Office_Hours_Saim.day2_StringAndLoops;
/*

Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */

public class comboString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hi";
        String result = "";

        if(a.length() > b.length()){
            result = b.concat(a).concat(b);

        }else{
            result = a.concat(b).concat(a);
        }
        System.out.println(result);

    }
}
