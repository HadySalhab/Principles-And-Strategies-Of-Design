package com.company;

public interface RestaurantInterface {
    //violation
    //clients who order online has to override unnecessary methods (like payInPerson)
    //clients who order inPerson has to override methods related to online process
    void acceptOnlineOrder();
    void takeTelephoneOrder();
    void payOnline();
    void walkInCustomerOrder();
    void payInPerson();
}


