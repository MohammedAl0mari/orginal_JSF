package com.learn.first.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class configurConnection {
    Connection conn;
    public Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/JSF",
                "root",""
        );

        if(conn!=null){
            System.out.println("Succsess ");
            return conn;

        }
        return null;
    }

    public void closeConnection(Connection connection) throws Exception{
        if(connection!=null){
            connection.close();
        }
    }

    public static void main(String a[]) throws Exception{
        configurConnection connection= new configurConnection();
        connection.getConnection();
    }
}
