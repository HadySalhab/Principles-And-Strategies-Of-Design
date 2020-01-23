package com.company;

interface DBConnectionInterface {
    public int connect();
}
class MySqlConnection implements DBConnectionInterface{
    @Override
    public int connect() {
        return 1;
    }
}

public class PasswordReminder {
    private DBConnectionInterface dbConnection;

    //no more dependency on a low level class, we are relying on the high level class of connection (DBConnection)
    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}
