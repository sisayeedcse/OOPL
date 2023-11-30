package Practices;
import java.util.*;
public class StudentInfos {
    public static class Student{
        String name;
        int age;
        int id;
        double percentage;
        public void printinfo(){
            System.out.println("The student name is "+ this.name);
            System.out.println(this.name+"'s age is "+ this.age);
            System.out.println(this.name+"'s id is "+ this.id);
            System.out.println(this.name+"'s percentage is "+ this.percentage);

        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();

        // Scanning information from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        s1.name = scan.nextLine();
        System.out.println("Enter Age");
        s1.age = scan.nextInt();
        System.out.println("Enter id");
        s1.id = scan.nextInt();
        System.out.println("Enter Percentage");
        s1.percentage = scan.nextDouble();

        // Printing the information calling the print function
        s1.printinfo();
    }
}
