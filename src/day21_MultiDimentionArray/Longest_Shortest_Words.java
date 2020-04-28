package day21_MultiDimentionArray;
/*
write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {
        String [] names = {"Reem, Omer", "Muhtar", "Emrah", "Mohamed", "Ana", "FFFGGGGJGKJGKGLG"};
        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();

        String longestWord = "";
        String shorterWord = "";

        for( int i = 0; i < names.length; i++){

            if(names[i].length() > maxLengthString){
                maxLengthString = names[i].length();
                longestWord = names[i];

            }
            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shorterWord = names[i];
            }



        }
        System.out.println(longestWord);
        System.out.println(shorterWord);

    }
}
