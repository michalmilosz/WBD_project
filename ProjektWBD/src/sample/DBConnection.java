package sample;

import javafx.scene.control.Alert;

import java.sql.*;

public class DBConnection  {
    public static Connection conn;
    public static DBConnection getConnection(){
            String DB_URL = "d";
            String DB_USER = "wq";
            String DB_PASS = "qq";
            try {
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            }
            catch(SQLException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Błąd połączenia");
                alert.setContentText("Details: " + e.getMessage());
                alert.showAndWait();
            }
    }
}
