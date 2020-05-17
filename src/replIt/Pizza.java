package replIt;
/*
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large), the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */

public class Pizza {
    private String size;
    int numCheeseTopping;
    int numPepperoniTopping;
    int numHamTopping;

    public Pizza(String size, int numCheeseTopping, int numPepperoniTopping, int numHamTopping) {
        this.size = size;
        this.numCheeseTopping = numCheeseTopping;
        this.numPepperoniTopping = numPepperoniTopping;
        this.numHamTopping = numHamTopping;
    }

    public String getSize(){
        return size;

    }
    public void setSize(String size){
        this.size = size;
    }
    public int getNumCheeseTopping(){
        return numCheeseTopping;

    }
    public void setNumCheeseTopping(int numCheeseTopping){
        this.numCheeseTopping = numCheeseTopping;
    }
    public int getNumPepperoniTopping(){
        return numPepperoniTopping;

    }
    public void setNumPepperoniTopping(int numPepperoniTopping){
        this.numPepperoniTopping = numPepperoniTopping;
    }
    public int getNumHamTopping(){
        return numHamTopping;

    }
    public void setNumHamTopping(int numHamTopping){
        this.numHamTopping = numHamTopping;
    }

        public double calcCost() {

            double cost = 0;

            if (size.equalsIgnoreCase("small")) {
                cost = 10 + 2 * (numCheeseTopping + numPepperoniTopping + numHamTopping);
            } else if (size.equalsIgnoreCase("medium")) {
                cost = 12 + 2 * (numCheeseTopping + numPepperoniTopping + numHamTopping);
            } else if (size.equalsIgnoreCase("large")) {
                cost = 14 + 2 * (numCheeseTopping + numPepperoniTopping + numHamTopping);
            }
        return cost;
    }
    public String getDescription(){
        return size + " Pizza with "+numCheeseTopping+" Cheese toppings, " +
                numPepperoniTopping+" Pepperoni toppings, and "+
                numHamTopping + " Ham toppings."+
                "\nTotal Price: "+calcCost();
    }

}
