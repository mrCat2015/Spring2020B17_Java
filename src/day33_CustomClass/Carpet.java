package day33_CustomClass;
/*
create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
 */

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double W, double L, double priceEach, boolean isPersian){
        width = W;
        length = L;
        unitPrice = priceEach;

    }
    public double calcCost(){
        double totalPrice = (width * length)*unitPrice;
        if(isPersian == true){
            totalPrice += 200;
        }
        return totalPrice;
    }
    public String toString(){
        return "Width of carpet: "+width+", \nLength of carpet: " + length+ ", \nTotal price: $"+ calcCost();
    }


}
