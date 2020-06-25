package Interview_Questions;
/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class Frequency_of_Characters {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String nonDuplicate = "";
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(!nonDuplicate.contains(""+str.charAt(i))){
                nonDuplicate += str.charAt(i);                          //after this loop we have ABCD
            }

        }
        System.out.println(nonDuplicate);



        for(int j = 0; j < nonDuplicate.length(); j++){
            int count = 0;
            for(int k = 0; k < str.length(); k++){
                if(str.charAt(k)== nonDuplicate.charAt(j)){
                    count++;
                }

            }
            result += nonDuplicate.charAt(j)+""+count;
            }

        System.out.println(result);



        String str1 = "AAFFFABBCDD";
        String nonDuplicate1= "";
        String result1 = "";

        for(int i = 0; i <str1.length(); i++){
            if(!nonDuplicate1.contains(""+str1.charAt(i))){
                nonDuplicate1 += str1.charAt(i);
            }

        }

        System.out.println(nonDuplicate1);

        for(int k=0; k<nonDuplicate1.length(); k++){
            int count1 = 0;
            for(int j=0; j < str1.length(); j++){
                if(nonDuplicate1.charAt(k) == str1.charAt(j))
                count1++;
            }
            result1  += ""+nonDuplicate1.charAt(k) + count1;
        }

        System.out.println(result1);
 /*
    Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
        System.out.println("==================");

        String str2 = "AAABBCDD";
        String nonDupl2 = "";
        String result2 = "";

        for(int i=0; i<str2.length(); i++){
           if(!nonDupl2.contains(""+str2.charAt(i))){
                nonDupl2 += str2.charAt(i);
                        }
                 }
        System.out.println(nonDupl2);


        for(int i = 0; i <nonDupl2.length(); i++){
            int count = 0;
            for(int k = 0; k <str2.length(); k++){
                if(str2.charAt(k)==nonDupl2.charAt(i)){
                    count++;
                }

            }
            result2 += nonDupl2.charAt(i)+""+count;

        }
        System.out.println(result2);















    }



















}
