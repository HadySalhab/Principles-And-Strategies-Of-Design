package com.company;

public interface DisplayModule {
    public void display();
}
class Monitor implements DisplayModule{
    @Override
    public void display() {
        System.out.println("Display through a Monitor");
    }
}
class Projector implements DisplayModule{
    @Override
    public void display() {
        System.out.println("Display through a projector");
    }
}

class Computer {
    DisplayModule dm;

    public void setDm(DisplayModule dm) {
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }
}