package day15_ForLoop;

public class fvd {


    public static void main(String[] args) {



        System.out.println(theEnd("Hello", true));
    }
    public static String theEnd(String str, boolean front) {



        if(front){
            return str.substring(0, 1);
        }else{
            return str.substring(str.length()-1);
        }

    }



}
