package day16_ForLoop;

public class breakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                break;

            }


        }
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);

            if (i == 'e') {
                break;

            }
            System.out.println(i);
        }
    }
}
