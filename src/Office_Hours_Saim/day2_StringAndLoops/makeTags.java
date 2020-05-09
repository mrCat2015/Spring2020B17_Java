package Office_Hours_Saim.day2_StringAndLoops;
/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */

public class makeTags {
    public static void main(String[] args) {
        String tag = "cite";
        String word = "Yay";

        String result = "<"+tag+">"+word+"</"+tag+">";
        System.out.println(result);
    }
}
