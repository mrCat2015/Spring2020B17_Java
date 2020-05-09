package replIt;
/*
Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
 */

public class Combine_to_full_name {
    public static String[] combineNames(String[] first_names, String[] last_names){

        String [] combine = new String[first_names.length];

        for(int i = 0; i < combine.length; i++){
            combine[i] = first_names[i] + " " + last_names[i];
        }


        return combine;


    }

    public static void main(String[] args)
    {


        //feel free to test code here
    }
}
