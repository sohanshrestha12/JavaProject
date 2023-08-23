/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvgenerator1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class DbConnection {
     public static final String dburl = "jdbc:mysql://localhost:3306/cvgenerator";
    public static final String username = "root";
    public static final String password = "";
    
    public  Connection connectDb(){
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("this is connectionm");
            conn = DriverManager.getConnection(dburl, username, password);
            if(conn != null){
                System.out.print("yes");
            }
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
