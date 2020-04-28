package day21_MultiDimentionArray;

public class ScrumTeam {
    public static void main(String[] args) {
        String [] DevTeam = {"Zeynep", "Haider", "Jpovid", "Muhtar"};
        String [] Testers = {"Rahman", "Aishan", "Osman", "Ali"};
        String [] PO = {"Barzy", "Donald"};
        String[]TesterTeam2 = {"Iham", "Zarina", "Aizan", "Asiman"};

        String[][] ScrumTeam = {DevTeam, Testers, PO};
        //                         0         1     2

        ScrumTeam[0] [3] = "Jean";
        ScrumTeam[1] = TesterTeam2;


        System.out.println(ScrumTeam[0] [3]);
        String info = ScrumTeam[1][2];
        System.out.println(info);
        System.out.println("==============================");

        for(String each: ScrumTeam[1]){
            System.out.println(each);
        }
        System.out.println("===============================");
        System.out.println(ScrumTeam[2][1]);





    }
}
