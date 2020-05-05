package day34_CustomClass;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double W, double L, double priceEach, boolean isPersianCarpet){
        width = W;
        length = L;
        unitPrice = priceEach;
        isPersian = isPersianCarpet;

    }
    public double calcCost(){
        double totalPrice = (width + length)*unitPrice;
        if(isPersian==true){
            return totalPrice+200;
        }else{
            return totalPrice;

        }
    }
    public String toString(){
        return "Width of carpet: "+width+", \nLength of carpet: " + length+ ", \nTotal price: $"+ calcCost();
    }


}
