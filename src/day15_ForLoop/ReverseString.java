package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Maxim Zabolotnykh";

        int lastindexnum = str.length()-1;

        String reverse = "";

        for(int i = lastindexnum; i >= 0; i--){
           // System.out.print(str.charAt(i));
            reverse += str.charAt(i);


        }
        System.out.println(reverse);

    }
}
