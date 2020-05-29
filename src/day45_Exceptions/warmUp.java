package day45_Exceptions;

public class warmUp {
    public static void main(String[] args) {
        int pushUps = 0;
        int count = 0;
        while(pushUps < 50){
            System.out.println("PushUps " + (pushUps+1));
            try{
                Thread.sleep(300);
            }catch(Exception e){

            }




            pushUps++;
        }
    }
}
