package day17_Whileloops;

public class BranchingStatement {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            if(i %2 != 0){
                System.exit(0); //system.exit(0): stops the entire program immediately
            }
            System.out.println(i);
        }
        System.out.println("Test completed");

    }
}
