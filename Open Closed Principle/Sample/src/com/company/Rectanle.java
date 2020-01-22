package com.company;

public class Rectanle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length*width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7)*radius*radius;
    }
}

class AreaCalculator {
    //IN this case the AreaCalculator class is CLOSED to modification, with every shape added, we don't need to
    //add new method to calculate the area.
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}
