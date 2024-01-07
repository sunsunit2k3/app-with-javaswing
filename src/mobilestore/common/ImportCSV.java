package mobilestore.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImportCSV {
public static String importCsvData(String csvFilePath) {
    String url = "jdbc:mysql://localhost:3306/moblie_store_db";
    String username = "root";
    String password = "";
    String insertQuery = "INSERT INTO products (title, image, description, price, quantity) VALUES ( ?, ?, ?, ?, ?)";
    String message = " ";

    try (Connection connection = DriverManager.getConnection(url, username, password);
        BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            preparedStatement.setString(1, data[1]);
            preparedStatement.setString(2, data[2]);
            preparedStatement.setString(3, data[3]);
            preparedStatement.setInt(4, Integer.parseInt(data[4]));
            preparedStatement.setInt(5, Integer.parseInt(data[5]));
            preparedStatement.executeUpdate();
        }
        message = "CSV data imported successfully.";
    } catch (IOException | SQLException e) {
        message = "Error importing CSV data: " + e.getMessage();
    }
       return message;
   }
}
