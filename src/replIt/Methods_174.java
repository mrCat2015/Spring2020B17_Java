package replIt;
/*
The method gets a string and returns a string minus the first letter.

for example:

removeFirst("aaa")
returns "aa"

 */

public class Methods_174 {
    public static void main(String[] args) {
        removeFirst("aaa");
    }
    public static String removeFirst(String target) {
        String result = target.substring(1);
        System.out.println(result);

        return result;

    }
}
