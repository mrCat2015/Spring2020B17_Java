package day18_NesteLoop;

public class Nested_Loop {
    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }


        System.out.println("================");

        for(int i = 0; i < 7; i++){
            int a = 1;
            while(a <= 100){
                System.out.print("*");
                a++;
        }
            System.out.println();


        }

    }
}
