package replIt;
/*
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)
 */
public class Methods_171 {
    public static String limit(String text, int maxLength)
    {
        String result = text.substring(0, maxLength);
        System.out.println(result);

        return result;

    }

    public static void main(String[] args) {
        limit("bla bla",3);
    }

}
