
package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Connect {
    public static Connection connect(){
        String url = "jdbc:C:\\Users\\Janis\\Desktop\\SKOLA\\rcs_JAVA\\SQL\\SQL11.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        }catch(Exception e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return conn;
    }

    public static void readEmployees(Connection conn) {
        String sql = "SELECT * FROM employee";

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Vārds: " + rs.getString("vards"));
                System.out.println("Uzvārds: " + rs.getString("uzvards"));
                System.out.println("Darba stāžs: " + rs.getInt("darba_stazs") + " gadi");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


