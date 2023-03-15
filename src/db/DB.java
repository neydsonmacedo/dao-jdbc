package db;

import java.io.FileInputStream;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import static java.lang.Class.*;

public class DB {
    private static Connection conn = null;
    public static Connection getConnection(){
        if (conn == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String username = "developer";
                String password = "05B23*7a";
                String url = "jdbc:mysql://localhost:3306/coursejdbc";
                conn = DriverManager.getConnection(url,username,password);

            }
            catch (Exception e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;


    }

    public static void closeConnection(){
        if(conn != null ){
            try{
                conn.close();
            }
            catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement st){
        if (st!= null){
            try{
                st.close();
            }
            catch(SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }
    public static void closeResultSet(ResultSet rs){
        if (rs!= null){
            try{
                rs.close();
            }
            catch(SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

}
