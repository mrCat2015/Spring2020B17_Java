package replIt;
/*
Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
 */

public class divBy3_082 {
    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){
            if( i % 3 == 0){
                System.out.print(i+" ");
            }


        }

    }
}
