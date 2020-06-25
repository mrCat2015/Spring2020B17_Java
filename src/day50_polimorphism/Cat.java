package day50_polimorphism;

public final class Cat extends Animal{  //3 variables and 3 inst. variables
    public String catName;

    public Cat(String catName, char gender, int age){
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }
    public String toString(){
        return "Cat Name: "+catName +"\nGender: "+ gender + "\nAge: "+age;
    }

    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }

    public void scratch(){

        System.out.println(catName + "is scratching");
    }

}
