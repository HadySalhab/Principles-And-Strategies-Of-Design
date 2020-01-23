package com.company;

public interface ShapeInterface {
    public double area();
     //this violates the interface segregation principle, because not every shape will have
    // volume
     public double volume();
}

