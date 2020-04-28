package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";

       int a1  = Integer.parseInt(str); //123

        System.out.println(str + 1); //text 1231
        System.out.println(a1 + 1);  //number 124

        byte a2 = Byte.parseByte(str);
        System.out.println(a2 + 5);

        Integer I1 = (int) Byte.parseByte(str);//Autoboxing

        String str2 = "10.5";
        float fl = Float.parseFloat(str2); // float 10.5
        System.out.println(fl);

        double db = Double.parseDouble(str2);
        System.out.println(db);

        String str3 = "31774845697";
        long lg1 = Long.parseLong(str3);
        System.out.println(lg1 + 2);

        Long lg2 = Long.parseLong(str3);


        String result1 = "true"; // not "true" or "false" ==> false

        boolean r1 = Boolean.parseBoolean(result1); //boolean, false
        System.out.println(r1);

        String result2 = "fALsE";  //"false"
        boolean r2 = Boolean.parseBoolean(result2);



    }
}
