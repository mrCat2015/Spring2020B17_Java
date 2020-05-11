package day37_Constructors;
//import java.util.Arrays; // only import Arrays class from java util
import java.util.*; //imports all the class from the package
/*
import static day37_Constructors.Data.staticVariable;
*/
import static day37_Constructors.Data.*;

public class ImportStatement {
    public static void main(String[] args) {
        int[ ] arr = {4,3,2,1};
        Arrays.sort(arr);

        System.out.println(staticVariable);
    }
}
