package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;


public class DevelopersObject {
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        developer1.setDeveloperInfo("Nigina", "Developer", 150000, 15963);
        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setDeveloperInfo("Leon", "Senior Developer", 130000, 178653);

        developer1.fixingBugs();
        developer2.fixingBugs();
        developer1.coding();
        developer2.coding();

        System.out.println("========================================");

        Developer [] arr = {developer1, developer2};

        for(Developer each: arr){
            System.out.println( each.name + " "+ each.salary );
        }
        System.out.println("========================================");

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(arr));
        System.out.println(developers.size());

      /*  for(int i = 0; i < developers.size(); i++){
            System.out.println(developers.get(i).name);
        }
        */

        for(Developer each: developers){
            System.out.println(each.name + " " + each.salary);

        }



    }
}
