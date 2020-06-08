package day47_Abstraction;

public abstract  class Employee {



    String name;
    int age;
    char gender;
    double salary;
    String jibTitle;

    abstract void work();

    public String toString(){
        return name + " "+ age;
    }


}
