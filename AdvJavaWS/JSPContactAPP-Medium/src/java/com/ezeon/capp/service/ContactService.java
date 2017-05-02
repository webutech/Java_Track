package com.ezeon.capp.service;
import com.ezeon.capp.domain.*;
import java.util.*;
/** Contact use-case implementation goes here */
public interface ContactService {
    void save(Contact c);
    void update(Contact c);
    void delete(Contact c);
    void delete(int contactId);
    /**
     * List all the contacts for a user who is logged in
     * userId: logged in userId
     *
     */
    List<Contact> findByUser(int userId);
    List<Contact> find(int userId,String key);
    Contact findById(int contactId);//find by PK
    List<Contact> findByCategory(int userId,String category);
}
