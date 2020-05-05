package day33_CustomClass;
/*
1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppisngs of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

 */
public class Pizza {
    String size;
    int numOfCheese;
    int numOfPepperoni;

    public void customizeOrder(String sizing, int cheese, int pepperoni){
        size = sizing;
        numOfCheese = cheese;
        numOfPepperoni = pepperoni;

    }
    public Double calcCost(){
        double cost;
        if(size.equalsIgnoreCase("small")){
            cost = 10 + (1.5 * numOfPepperoni) + numOfCheese;
        }else if(size.equalsIgnoreCase("medium")){
            cost = 12 + (1.5 * numOfPepperoni) + numOfCheese;
        }else{
            cost = 14 + (1.5 * numOfPepperoni) + numOfCheese;
        }
        return cost;


    }
    public String toString(){
        //return "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvailable Balance: "+balance;
        return "Pizza' size: " + size+ " ," +
                "\nQuantity of cheese topping: " +numOfCheese+ " , " +
                "\nQuantity of pepperoni topping: " +numOfPepperoni + ", " +
                "\nThe pizza cost: $" + calcCost();

    }

}
