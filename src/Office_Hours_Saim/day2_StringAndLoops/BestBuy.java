package Office_Hours_Saim.day2_StringAndLoops;

public class BestBuy {

    String location;
    int numberOfEmployees;
    String phoneNumber;
    static int numberOfComputer;

    public void close(){
        System.out.println("This best Buy is closed");

    }

    public static void closeAll(){  // a static method is called by class name like this:
        //c01_BestBuy.closeAll(); //All BestBuy stores are closing
        System.out.println("All are closing");
    }





}
