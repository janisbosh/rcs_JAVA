package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {

    public static Connection connect() {
        String url = "jdbc:sqlite:C:\\Users\\Janis\\Desktop\\TETIS SKOLA\\rcs_JAVA\\Day_10\\Day10_SQL\\chinook.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Connection Failed");
        }
        return conn;
    }

    public static void readArtists() {
        String sql = "SELECT * FROM artists";

        try {
            Connection conn = connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readArtists();
    }
}
