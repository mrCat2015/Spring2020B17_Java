package day17_Whileloops;

public class Frequency {

    public static void main(String[] args) {

        String str = "Cybertek School is a great place to study";

        int count = 0;

        String word = "s".toLowerCase(); // ignoring the case sensitiveily by convirting both string to lowercase

        while(str.contains(word)){
            count++;
            str = str.replaceFirst(word, "");//after counting the first "Java", we need to remove it by ""
        }
        System.out.println(count);
        System.out.println(str);








    }
}
