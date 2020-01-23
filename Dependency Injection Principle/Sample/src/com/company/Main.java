package com.company;

public class Main {

    public static void main(String[] args) {
	Service service = new ServiceA();
	Client client = new Client(service);
	client.doSomething();

	client.setMyService(service);
    }
}
