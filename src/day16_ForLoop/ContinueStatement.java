package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }

        for(int i=0; i<=20; i++){
            if(i % 2 !=0){
                continue; //skips all the odd numbers
            }
            System.out.print(i+" ");

        }
    }
}
