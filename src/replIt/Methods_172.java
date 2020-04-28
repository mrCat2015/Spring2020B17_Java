package replIt;
/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"
 */

public class Methods_172 {
    public static String at3(String target,String word)
    {
        String result = "";
        int length = target.length()-1;

        if(length == 2){
            result = target.substring(0, 3) + word;
        }else{
            result = target.substring(0, 3) + word.substring(0) + target.substring(3);
        }



        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {


        at3("longword","foo");
    }
}
