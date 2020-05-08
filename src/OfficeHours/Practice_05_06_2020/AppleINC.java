package OfficeHours.Practice_05_06_2020;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setInfo("Elton John","Junior Tester",75000,1245);

        Tester tester2 = new Tester();
        tester2.setInfo("Rahman","SDET",120000,22222);

        Tester tester3 = new Tester();
        tester3.setInfo("Adil", "SDET", 111000, 1020304050);

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(22222);


      //  scrum1.testersTeam  //returns the testersTeam arraylist from scrum1

        for(Tester each: scrum1.testersTeam ){
            System.out.println(each);
        }

        System.out.println("====================================");

        System.out.println(scrum1.developTeam.size());

        Developer dev1 = new Developer();
        dev1.setDeveloperInfo("Kim", "Junior Developer", 120000, 90678);


        Developer dev2 = new Developer();
        dev2.setDeveloperInfo("Emrah", "Usta Developer", 100000,223232);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

       // scrum1.fireDeveloper(90678);

        System.out.println(scrum1.developTeam.size());

        for(Developer each: scrum1.developTeam){
            System.out.println(each);

        }

        System.out.println("=========================");

        System.out.println("In my scrum team, we have "+scrum1.developTeam.size()+" developers and "+scrum1.testersTeam.size()+" testers");











    }



}
