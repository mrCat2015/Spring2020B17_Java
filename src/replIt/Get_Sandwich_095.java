package replIt;

import java.util.Scanner;
/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */

public class Get_Sandwich_095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

 //          b r e a d j a m b r e  a  d
        //   0 1 2 3 4 5 6 7 8 9 10 11 12
       if (str.indexOf("bread")!=str.lastIndexOf ("bread")) {


            result = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
                }else{
                    result = "nothing";
                }



        System.out.println(result);
        }



}
