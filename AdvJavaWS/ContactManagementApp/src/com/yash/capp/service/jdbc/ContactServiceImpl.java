package com.yash.capp.service.jdbc;

import com.yash.capp.db.*;
import com.yash.capp.domain.*;
import com.yash.capp.exception.ContactAppException;
import com.yash.capp.service.*;

import java.sql.*;
import java.util.*;

public class ContactServiceImpl extends JDBCUtil implements ContactService {

    public void save(Contact c) {
        String q = "insert into contact(userId,name,email,phone,address,category) values(?,?,?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = super.createPreparedStatement(q);
            pst.setInt(1, c.getUserId());
            pst.setString(2, c.getName());
            pst.setString(3, c.getEmail());
            pst.setString(4, c.getPhone());
            pst.setString(5, c.getAddress());
            pst.setString(6, c.getCategory());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ContactAppException(e);
        } finally {
            super.closePreparedStatement(pst);
            super.closeConnection();
        }
    }

    public void update(Contact c) {
         String q = "update CONTACT set name=?,email=?,phone=?,address=?,category=? where contactId=?";
        PreparedStatement pst = null;
        try {
            pst = super.createPreparedStatement(q);         
            pst.setString(1, c.getName());
            pst.setString(2, c.getEmail());
            pst.setString(3, c.getPhone());
            pst.setString(4, c.getAddress());
            pst.setString(5, c.getCategory());
            pst.setInt(6, c.getContactId());

            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ContactAppException(e);
        } finally {
            super.closePreparedStatement(pst);
            super.closeConnection();
        }
    }

    public void delete(Contact c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(int contactId) {
        String q = "delete from contact where contactId=?";
        PreparedStatement pst = null;
        try {
            pst = super.createPreparedStatement(q);
            pst.setInt(1, contactId);

            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ContactAppException(e);
        } finally {
            super.closePreparedStatement(pst);
            super.closeConnection();
        }
    }

    public List<Contact> findByUser(int userId) {
        List<Contact> contacts = new ArrayList<Contact>();
        String q = "select contactId,name,email,phone,address,category from Contact where userId=" + userId;
        PreparedStatement pst = null;
        try {
            pst = super.createPreparedStatement(q);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Contact c = new Contact();
                c.setContactId(rs.getInt("contactId"));
                c.setName(rs.getString("name"));
                c.setPhone(rs.getString("phone"));
                c.setAddress(rs.getString("address"));
                c.setEmail(rs.getString("email"));
                c.setCategory(rs.getString("category"));
                contacts.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ContactAppException(e);
        } finally {
            super.closePreparedStatement(pst);
            super.closeConnection();
        }
        return contacts;
    }

    public List<Contact> find(int userId, String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Contact findById(int contactId) {
        Contact c = null;
        String q = "select contactId,name,email,phone,address,category from Contact where contactId=" + contactId;
        PreparedStatement pst = null;
        try {
            pst = super.createPreparedStatement(q);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                c = new Contact();
                c.setContactId(rs.getInt("contactId"));
                c.setName(rs.getString("name"));
                c.setPhone(rs.getString("phone"));
                c.setAddress(rs.getString("address"));
                c.setEmail(rs.getString("email"));
                c.setCategory(rs.getString("category"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ContactAppException(e);
        } finally {
            super.closePreparedStatement(pst);
            super.closeConnection();
        }
        return c;
    }

    public List<Contact> findByCategory(int userId, String category) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
