package day40_Encapsulation;

public class Person {

    private long SSN;
    private int ID;

    public String name;

    public Person(String name){
        this.name = name;

    }

    public long getSSN(){
        return SSN;
    }
    // we ned to generate setter:
    // preferred name is setVariableName()
    // better to be public access modifier to be used everywhere
    // return type is void because we are not returning anything
    // we must pass an argument (parameter)
    // argument dataType MUST match private instance variable dataType: long here

    public void setSSN(long SSN){
        this.SSN = SSN;

    }
    public long getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setSSNAndID(long SSN, int ID){
    /*    setSSN(SSN);
        setID(ID);

     */
        this.SSN = SSN;
        this.ID = ID;

    }
}
