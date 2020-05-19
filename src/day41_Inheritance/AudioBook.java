package day41_Inheritance;

public class AudioBook extends Book {
    /*
    public String title;
    public String author;
    public double price;

    public String toString()
     */
    public String length;

    public void listen(){
        System.out.println("listen to "+title);
    }
    public static void main(String[] args) {
        AudioBook b1 = new AudioBook();



    }

}
