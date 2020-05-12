package day38_Construction;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task04:
	create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString(){
        return "Name: "+name+"\nUnit Price: "+unitPrice+"\nQuantity: "+quantity+ "\nPrice: $"+calcCost();//instance method : toString() to specify how we want to print our item information
    }

    public Double calcCost(){
        return unitPrice * quantity;

    }

}

class ShoppingList{
    public static void main(String[] args) {
        Item item1 = new Item("Cheese", 5, 2);
        Item item2 = new Item("Milk", 3, 1);
        Item item3 = new Item("Apples", 1, 5);
        Item item4 = new Item("Bananas", 0.5, 6);
        Item item5 = new Item("Bluberry", 4, 2);

        ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5));

        double total = 0;

     /*   for(Item each: list){
            total += each.calcCost();
            System.out.println(each);

        }*/

        for(int i=0; i < list.size(); i++){
            total += list.get(i).calcCost();
            System.out.println(list.get(i));
        }
        System.out.println("========================");
        System.out.println("Total Price: $"+total);
    }

}
