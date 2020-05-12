package Task;
/*
create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
			  	Add a constructor that can allow user to set the size and toppisngs of the pizza
				instance method:
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
	create a class called Order
			create five objects of the pizza
			create an arraylist of pizza and add those 5 objects into it
			calculate the total price of the order (use for each loop)
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    String size;
    int numOfCheeseTopping;
    int numOfPepperoniTopping;

    public Pizza(String size, int numOfCheeseTopping, int numOfPepperoniTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoniTopping = numOfPepperoniTopping;
    }
    public Double calcCost(){
        double cost;
        if(size.equalsIgnoreCase("small")){
            cost = 10 + (1.5 * numOfPepperoniTopping) + numOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium")){
            cost = 12 + (1.5 * numOfPepperoniTopping) + numOfCheeseTopping;
        }else{
            cost = 14 + (1.5 * numOfPepperoniTopping) + numOfCheeseTopping;
        }
        return cost;

    }

    public String toString(){
        return "Pizza size: " +size+"\nquantity of cheese topping: "
                + numOfCheeseTopping + "\nquantity of pepperoni topping: "+numOfPepperoniTopping + "\npizza cost: $"+calcCost();
    }

}
class Order{
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small", 1, 1 );
        Pizza pizza2 = new Pizza("medium", 2, 1);
        Pizza pizza3 = new Pizza("large", 2, 2);
        Pizza pizza4 = new Pizza("small", 2, 2);
        Pizza pizza5 = new Pizza("medium", 1, 2);

        ArrayList<Pizza> list = new ArrayList<>();
        list.addAll(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));

        double total = 0;

        for(Pizza each: list){
            total +=each.calcCost();
            System.out.println(each);
        }

        System.out.println("Order Total Price: $"+total);

    }

}

