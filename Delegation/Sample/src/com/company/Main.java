package com.company;

public class Main {
    public static void main(String[] args) {
        //to the outside world, it looks like the Printer is actually printing
        Printer printer = new Printer();
        printer.print();
    }
}

//delegate class
class RealPrinter {
    void print() {
        System.out.println("The Delegate");
    }
}

//delegator
class Printer {
    //HAS-A delegate , composition
    RealPrinter rp = new RealPrinter();

    //delegate the responsibility to the delegate class
    void print() {
        rp.print();
    }
}