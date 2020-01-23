package com.company;

import com.company.violation.Circle;
import com.company.violation.Ellipse;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car(); //we can easily replace superclass reference with another subclass object, without breaking
        // the code
        vehicle.getCubicCapacity();



        //VIOLATION, circle is no longer a circle in this example
        //it is hard in this case to assign a subtype object to a supertype reference
        Ellipse x = new Circle();
        x.setLengthX(5);
        x.setLengthY(4);
    }
}
