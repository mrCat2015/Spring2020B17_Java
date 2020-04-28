package Task;
/*
1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
 */


//Warm Up Task 1 & 2
public class Dublicates {
    public static void main(String[] args) {

        Duplicate("aaabbbccc");
        Frequency("AAABB", "A");
    }
    public static String Duplicate(String str){
        String duplicate = "aaabbbccc";
        String nonDup = "";

        for(int i = 0; i <=duplicate.length()-1; i++){
            if(!nonDup.contains(duplicate.charAt(i) + "")){
                nonDup += duplicate.charAt(i);

            }
        }
        System.out.println(nonDup);
        return nonDup;

    }

    public static int Frequency (String str1, String str2){
        int count = 0;

        for(int i = 0; i < str1.length(); i++){
            if(("" + str1.charAt(i)).equals(str2)){
                count ++;

            }
        }
        System.out.println(count);
        return count;

    }

}
