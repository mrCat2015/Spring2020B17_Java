package Office_Hours_Saim.day3_05_16_2020;

public class stringEE {
    public static void main(String[] args) {
        String str = "Heelele";
        boolean result = true;
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e') count++;
        }
        result = count>=1 && count <= 3;
        System.out.println(result);

    }
}
