package day17_Whileloops;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println("=========");
        int sum = 0;
        int i = 0;
        while(i <=10){
            if(i % 2 == 0){
                //System.out.println(i);
                sum += i;

            }
            i++;
        }
        System.out.println(sum);

    }
}
