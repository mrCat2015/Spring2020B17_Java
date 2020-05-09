package Office_Hours_Saim.day2_StringAndLoops;

public class firstTwo {
    public static void main(String[] args) {
        String str = "Hello";
        String result = "";

        if(str.length() >1){
            result =  str.substring(0,2);
        }else if(str.length() == 1){
            result = str;

    }else {
            result = "";

        }
        System.out.println(result);
    }
}
