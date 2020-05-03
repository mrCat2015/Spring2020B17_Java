package replIt;
/*
extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)
 */

public class Methods_With_String_12 {
    public static String extractNum(String s) {
        char [] arr = s.toCharArray();
        String res = "";

        for(char each: arr){
            if(Character.isDigit(each)){
                res += each;
            }

        }


return res;

    }

    public static void main(String[] args) {
       String result =  extractNum("aa2aa3");
        System.out.println(result);
    }

}
