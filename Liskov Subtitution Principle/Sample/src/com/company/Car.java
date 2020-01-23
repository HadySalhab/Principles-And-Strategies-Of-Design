package com.company;

import com.company.Vehicle;

class Car extends Vehicle{

    @Override
    protected int getSpeed() {
        return 0;
    }

    @Override
    protected int getCubicCapacity() {
        return 0;
    }
    public boolean hatchBack(){
        return true;
    }
}