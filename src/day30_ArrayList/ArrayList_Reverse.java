package day30_ArrayList;
/*
 write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
 */

import java.util.ArrayList;

public class ArrayList_Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <=5; i++ ){
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> reversedList = new ArrayList<>();


        for(int i = list.size(); i >0; i--){
          // int eachNum =  list.get(i);
            reversedList.add(i);

        }
        System.out.println(reversedList);
    }
}
