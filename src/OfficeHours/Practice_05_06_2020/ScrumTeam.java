package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();

    ArrayList<Developer> developTeam = new ArrayList<>();


    public void hireTester(Tester tester){
        testersTeam.add(tester);


    }
    public void fireTester(long ID){
        testersTeam.removeIf(p -> p.employId == ID);

    }
    public void hireDeveloper(Developer developer){
        developTeam.add(developer);

    }
    public void fireDeveloper(long ID){
        developTeam.removeIf(p -> p.employId == ID);

    }



}
