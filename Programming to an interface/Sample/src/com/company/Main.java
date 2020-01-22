package com.company;

public class Main {

    public static void main(String[] args) {
        Computer cm = new Computer();
        DisplayModule dm1 = new Monitor(); //Programming to an interface
        DisplayModule dm2 = new Projector(); //Programming to an interface

        //can be changed at runtime, loose coupling.
        cm.setDm(dm1);
        cm.display();
        cm.setDm(dm2);
        cm.display();
    }
}
