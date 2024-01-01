package com.mycompany.test;
public class Test extends SlidingDoor{
    public static void main(String[] args) {
        SlidingDoor sd = new SlidingDoor();
        sd.open();
        sd.closed();
    }
}
abstract class Door
{
    public abstract void open();
    public abstract void closed();
}
class SlidingDoor extends Door{
    public void open(){
        System.out.println("The door is open");
    }
    public void closed(){
        System.out.println("The door is closed");
    }
}
