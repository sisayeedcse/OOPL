package Practices;
import java.util.Scanner;
public class Car {
    String B;String M;String F;
    Car(){
        B = "B";
        M = "M";
        F = "F";
    }
    void BMW(){
        String name = "BMW 001";
        String model = "V5";
        String speed = "500kmp";
        String price = "5CR";
        System.out.println("Name- " + name);
        System.out.println("Model- " + model);
        System.out.println("Speed- " + speed);
        System.out.println("Price- " + price);
    }
    void Mercedes(){
        String name = "Mercedes v8";
        String model = "0L1";
        String speed = "800kmp";
        String price = "15CR";
        System.out.println("Name- " + name);
        System.out.println("Model- " + model);
        System.out.println("Speed- " + speed);
        System.out.println("Price- " + price);
    }
    void Ferrari(){
        String name = "Ferrari v10";
        String model = "F8";
        String speed = "1800kmp";
        String price = "50CR";
        System.out.println("Name- " + name);
        System.out.println("Model- " + model);
        System.out.println("Speed- " + speed);
        System.out.println("Price- " + price);
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        for(int i=0;i<=5;i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a character (BMW=B, MERCEDES=M, FERRARI=F )- ");
            String x = scan.next();
            if(x.equals(car1.B)){
                car1.BMW();
                break;
            }
            else if(x.equals(car1.M)){
                car1.Mercedes();
                break;
            }
            else if(x.equals(car1.F)){
                car1.Ferrari();
                break;
            }
            else {
                System.out.println("Please enter valid character!");
            }
        }
    }
}
