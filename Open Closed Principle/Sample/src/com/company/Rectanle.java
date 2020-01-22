package com.company;

public class Rectanle {
    public double length;
    public double width;
}

class Circle {
    public double radius;
}

class AreaCalculator {
    //IN this case the AreaCalculator class is OPEN to modification, with every shape added, we need to
    //add new method so we can calculate the area.
    public double caculateRectangleArea(Rectanle rectangle) {
        return rectangle.length * rectangle
                .width;

    }

    public double calculateCircleArea(Circle circle) {
        return (22 / 7) * circle.radius * circle.radius;
    }

}
