package com.yash.capp.service;
//User use-case implementation goes here

import com.yash.capp.domain.*;
import com.yash.capp.exception.UserAuthanticationException;
import java.sql.SQLException;
/**
 * The implementation  of this interace can perform the user related operations(Impl of User Use-Case)
 * @author sm
 */
public interface UserService {
    /**
     * Register a new user
     * @param user
     */
    void register(User user);
    /**
     * Returns the user who is logged in successfully, if login fails then raise an exception
     */
    User login(User user) throws UserAuthanticationException,SQLException ;
}
