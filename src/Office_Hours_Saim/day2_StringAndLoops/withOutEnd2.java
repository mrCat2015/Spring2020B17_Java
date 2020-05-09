package Office_Hours_Saim.day2_StringAndLoops;

public class withOutEnd2 {
    public static void main(String[] args) {
        String str = "Hello";
        String result = "";

        if(str.length() > 1){
            result = str.substring(1, str.length()-1);
        }else{
            result = "";
        }



        System.out.println(result);
    }



}
