package services;

import java.sql.*;
import java.util.ResourceBundle;

public class CheckpointService {

    private ResourceBundle resourceBundle = ResourceBundle.getBundle("Application");

    public String getConnection(){
        String url = resourceBundle.getString("database.url");
        String dbPassword = resourceBundle.getString("database.password");
        String dbUsername = resourceBundle.getString("database.username");
        try(Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            System.out.println("Connecting to the database...");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM checkpoint");
            return "Connected!";
        } catch (SQLException e) {
            System.out.println("Couldn't connect!");
            e.printStackTrace();
        }
        return "Couldn't connect...";
    }
}
