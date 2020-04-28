package replIt;
/*
uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */

public class Methods_167 {
    public static void main(String[] args) {
        System.out.println( uniqueChars("BugBusters") ) ;
    }

    public static String uniqueChars(String str) {
        String nonDupl = "";
        for(int i = 0; i <str.length(); i++){
            if(!nonDupl.contains(""+str.charAt(i))){
                nonDupl += str.charAt(i);
            }

        }
        return nonDupl;
    }
}
