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
    private Service myService;

    //Constructor Injection
    public  Client(Service service){
        this.myService = service;
    }
    public void doSomething(){
        myService.write("This is a message");
    }
}