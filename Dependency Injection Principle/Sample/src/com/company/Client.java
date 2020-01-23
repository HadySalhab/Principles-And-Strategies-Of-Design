package com.company;

public class Client {
    private ExampleService service;
    Client(){
    service = new ExampleService(); //HARD CODED DEPENDENCY
        //HARD to unit Test.
        //Hard to reuse
    }

    public String greet() {
    return "Hello" + service.getName();
    }

}
