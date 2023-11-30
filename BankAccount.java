package Practices;

import java.util.Scanner;

public class BankAccount {
    int depositBalance; int withdrawBalance; int newBalance;
    int mainBalance = 0;
    BankAccount(int x){
        mainBalance = 0;
        depositBalance = x;
        withdrawBalance = x;
    }
    void deposit(){
        System.out.print(mainBalance+ depositBalance);
    }
    void withdraw(){
        System.out.print(mainBalance - withdrawBalance);
    }
    void showBalance(){
        System.out.print(mainBalance);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        BankAccount acc = new BankAccount(x);
        if(s == "D"){
            acc.deposit();
        }
        else if(s == "W"){
            acc.withdraw();
        }
    }
}
