package com.company;


public class PasswordReminder {
    private int dbConnection;
    //Violation of the DI principle because, we are relying on concrete class.(MySqlConnection)
    public  PasswordReminder(MySqlConnection dbConnection){
        this.dbConnection = dbConnection;
    }
}
