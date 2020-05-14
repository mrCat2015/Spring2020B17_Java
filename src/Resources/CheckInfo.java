package Resources;

import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);
      //  System.out.println(PersonalInfo.grade);

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

       // System.out.println(obj.grade);
       // System.out.println(obj.age);

       // System.out.println(obj.SSN);
       // System.out.println(obj.id);



    }
}
