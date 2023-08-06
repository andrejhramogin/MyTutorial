package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbMethod {

    public void setData( ) {
        String url = "jdbc:postgresql://localhost/postgres";
        String name = "postgres";
        String password = "password";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();

            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

