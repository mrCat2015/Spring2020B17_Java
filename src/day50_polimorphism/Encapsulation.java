package day50_polimorphism;

public class Encapsulation {
    private String username = "Cybertek";

    public String getUsername(){//read only
        return username;
    }
    public void setUsername(String username){//write only
        this.username = username;
    }


}
class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
     //   System.out.println(obj.username);
        System.out.println(obj.getUsername());
        obj.setUsername("MIT");
        System.out.println(obj.getUsername());
    }
    /*
Inheritance:
        - build super class and sub class
        - easy way to get rich by inheriting from super class
        - super class:  Only gives. Can not inherit anything from child class.
        - sub class: can inherit visible variables and methods from super class (visible according to am) except cnstructor
        - sub class uses "extends" keyword to inherit from super class: class A extends B{ }
        - sub class uses "implements" keyword to inherit from interface/interfaces: class A extends B implements C,D{  }
        - Inheritance is pre-condition for polymorphism and for overriding methods
        - method overriding must happen in sub class
        - advantages of inheritance:
                - less codes
                - reusable
                - easy to maintain
        - PUBLIC or PROTECTED access modifier are visible anywhere in sub classes
        - DEFAULT access modifier is only visible in the same package
        -
 */
}


