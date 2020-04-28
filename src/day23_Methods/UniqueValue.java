package day23_Methods;
/*
Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */

public class UniqueValue {
    public static void main(String[] args) {
        String [] arr = {"A", "B", "A", "C"}; //B

     for(int j = 0; j <arr.length; j++){
         int count1 = 0;
         for(int i = 0; i <arr.length; i++){
             if(arr[i].equals(arr[j])){
                 count1++;
             }

         }
         if(count1 == 1){
             System.out.println(arr[j]);
         }

     }

        System.out.println("================================");

        for(String each2: arr) {

            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(each2);
            }

        }

        /*
        String str = "AAABBCC" ==> "ABC"
         */



    }
}
