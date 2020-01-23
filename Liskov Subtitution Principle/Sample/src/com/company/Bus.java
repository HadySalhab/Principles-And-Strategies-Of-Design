package com.company;

class Bus extends Vehicle{

    @Override
    protected int getSpeed() {
        return 0;
    }

    @Override
    protected int getCubicCapacity() {
        return 0;
    }
    String getEmergencyExit(){
        return "";
    }
}