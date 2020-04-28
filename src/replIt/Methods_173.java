package replIt;
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */

public class Methods_173 {
    public static void main(String[] args) {
        biggerS("apple", "orange");
    }
    public static String biggerS(String a ,String b)
    {
        String biggest = "";
        if(a.length() > b.length()){
            biggest = a;

        }else {
            biggest = b;

        }
        System.out.println(biggest);

        return biggest;

    }
}
