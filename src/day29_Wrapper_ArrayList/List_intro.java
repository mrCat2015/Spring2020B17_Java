package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_intro {
    public static void main(String[] args) {
        ArrayList <Integer> scores = new ArrayList<Integer>();

        scores.add(10); //Autoboxing
        scores.add(20);
        scores.add(30);
        System.out.println(scores);

        Integer a1= scores.get(2); //none
        int a2= scores.get(2); //unboxing
        double a3= scores.get(2); //unboxing
        System.out.println(a3);

        System.out.println("=======================");

        ArrayList<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        arr.add(1);
        arr.add(20);
        arr.add(3);
        arr.add(50);
        arr.add(800);
        arr.add(500);
        arr.add(5);

        for(int i = 0; i < arr.size(); i++){

            if(arr.get(i) > max){
                max = arr.get(i);
            }

        }
        System.out.println(max);

        int max2 = Integer.MIN_VALUE;
        for(Integer each: arr){
            if(each > max)
            max = each;
        }
        System.out.println(max);

        ArrayList <Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);

        maxNumber(list);
        System.out.println(list);



    }
    public static int maxNumber(ArrayList<Integer> arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.size(); i++){

            if(arr.get(i) > max){
                max = arr.get(i);
            }

        }
        return max;

    }


}
