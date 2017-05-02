package com.ezeon.capp.service.jdbc;

import com.ezeon.capp.db.*;
import com.ezeon.capp.domain.User;
import com.ezeon.capp.exception.ContactAppException;
import com.ezeon.capp.exception.UserAuthanticationException;
import com.ezeon.capp.service.*;
import java.sql.*;

/**
 *JDBC implementation of UserService
 */
public class UserServiceImpl extends JDBCUtil implements UserService{

    public void register(User user) {
        String sql="insert into user(name,phone,email,address,loginName,password) values(?,?,?,?,?,?)";
        PreparedStatement pst=null;
        try {
            pst=super.createPreparedStatement(sql);
            pst.setString(1, user.getName());
            pst.setString(2, user.getPhone());
            pst.setString(3, user.getEmail());
            pst.setString(4, user.getAddress());
            pst.setString(5, user.getLoginName());
            pst.setString(6, user.getPassword());
            pst.executeUpdate();
        } catch (Exception e) {
            throw new ContactAppException(e);
        }finally{
            super.closePreparedStatement(pst);
            super.closeConnection();
        }
    }

    public User login(User user) throws UserAuthanticationException, SQLException {
        String sql="select userId,name from USER where loginName=? and password=?";
        PreparedStatement pst=null;
        ResultSet rs=null;
        try {
            pst=super.createPreparedStatement(sql);
            pst.setString(1, user.getLoginName());
            pst.setString(2, user.getPassword());
            rs=pst.executeQuery();
            if(rs.next()){
                User loggedInUser=new User();
                loggedInUser.setUserId(rs.getInt("userId"));
                loggedInUser.setName(rs.getString("name"));
                return loggedInUser;
            }else{
                //failed login; not record found for given combination
                throw new UserAuthanticationException("Invalid login credentials");
            }
           
        }
        catch (SQLException e) {
            throw e;
        }finally{
            super.closePreparedStatement(pst);
            super.closeConnection();
        }
    }

}
