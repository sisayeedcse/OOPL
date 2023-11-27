package com.mycompany.calculator;
import java.util.*;
public class Calculator {
int num1, num2;
Calculator(int n1,int n2){
num1 = n1;
num2 = n2;
}
void add(){
    System.out.print("Add = ");
    System.out.println(num1+num2);
}
void sub(){
    System.out.print("Sub = ");
    System.out.println(num1-num2);
}
void mul(){
    System.out.print("Mul = ");
    System.out.println(num1*num2);
}
void div(){
    System.out.print("Div = ");
    System.out.println(num1/num2);
}
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    Calculator cal = new Calculator(x,y);
    cal.add();
    cal.sub();
    cal.mul();
    cal.div();
}
}
