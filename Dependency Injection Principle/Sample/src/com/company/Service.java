package com.company;

public interface  Service{
    void write(String message);
}
class ServiceA implements  Service{

    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}

class Client {
    //setter Injection
    public void setMyService(Service myService) {
        this.myService = myService;
    }

    //design to an interface not to an implementation
    private Service myService; //dependency Inversion, we are relying on top level class

    //Constructor Injection
    public  Client(Service service){
        this.myService = service;
    }
    public void doSomething(){
        myService.write("This is a message");
    }
}