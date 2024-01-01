package com.mycompany.test2;

public class Test2{
    public static void main(String[] args) {
        Circle cr = new Circle(5.2);    
        cr.area();
        cr.perimeter();
        cr.diameter();
    }
}
interface Shape
{
    public void area();
    public void perimeter();
}
class Circle implements Shape
{
    final double PI = 3.1416;
    protected double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println(PI*radius*radius);
    }
    public void perimeter(){
        System.out.println(2 * PI * radius);
    }
    public void diameter(){
        System.out.println(2*radius);
    }
}
