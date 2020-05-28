package day44_Exceptions;

public class try_catchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try{
            Thread.sleep(3000);
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("catch block");

        }

        System.out.println("World");
    }
}
