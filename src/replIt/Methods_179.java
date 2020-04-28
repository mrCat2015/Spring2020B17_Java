package replIt;
/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
 */

public class Methods_179 {
    public static String reverse(String input)
    {
        String reverse = "";
        for(int i = input.length()-1; i>=0; i--){
            reverse += input.charAt(i);
        }
        System.out.println(reverse);
        return reverse;

    }

    public static void main(String[] args) {
      //  String q = "student";
        reverse("student");
    }


}
