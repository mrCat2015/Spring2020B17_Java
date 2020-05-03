package replIt;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Arrays;

public class Methods_With_ArrayList_190 {
    public static void main(String[] args) {



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 4, -2, 6, -3, 7, -9));
        ArrayList<Integer> list2 = new ArrayList<>();


        Integer sum = 0;
        for(int each: list1) {
            if(each > 0){
                list2.add(each);
                sum += each;
            }


        }

        list2.add(sum);
        System.out.println(list2);



    }


}
