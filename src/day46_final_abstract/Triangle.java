package day46_final_abstract;

public class Triangle extends Shape {
    public double b;
    public double high;

    public Triangle(double b, double high){
        this.b = b;
        this.high = high;
    }
    @Override
    public void Area(){
        double area = b*high*1/2;
        System.out.println("Area of triangle is: "+area);

    }


}
