package OfficeHours.Practice_04_22_2020;

public class return_Method {
    public static void main(String[] args) {

      int num = sum(10, 30);
        System.out.println("===================");
        String name = "level";
        String name2 = Reverse(name);

        System.out.println(name.equals(name2));
    }
    public static int sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public static String Reverse(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result += str.charAt(i);

        }
        System.out.println(result);


        return result;
    }

}
