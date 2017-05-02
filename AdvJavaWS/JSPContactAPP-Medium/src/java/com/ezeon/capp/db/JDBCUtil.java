package com.ezeon.capp.db;

import java.sql.*;

public class JDBCUtil {
    static final String URL="jdbc:mysql://localhost:3306/contact_app_db12";
    static final String USER="root";
    static final String PASSWORD="admin";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private Connection con;

    public Connection openConnection() {
        try {
            if (con == null) {
                con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            if (con.isClosed()) {
                 con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
   
    
    public PreparedStatement createPreparedStatement(String query){
        try {
            openConnection();
            return con.prepareStatement(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
           throw new RuntimeException(ex);
        }
    }


    public void closePreparedStatement(PreparedStatement pst) {
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) { //silent
        }
    }
    public void closeStatement(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException ex) {
        }
    }
    public void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
        }
    }

    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
        }

    }
}
