package com.jdbc;

import com.sun.source.tree.WhileLoopTree;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3310/ejemplo";
        String username = "root";
        String password = "";


        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM persona");

            while (resultSet.next()){
                System.out.println(resultSet.getString("id") + resultSet.getString("name")+ resultSet.getString("apellidos"));
            }

            connection.close();
            statement.close();
            resultSet.close();
        }catch (SQLException e ){
            e.printStackTrace();
        }



    }
}
