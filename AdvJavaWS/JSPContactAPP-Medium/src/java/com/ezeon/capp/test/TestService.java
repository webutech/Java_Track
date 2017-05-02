package com.ezeon.capp.test;

import com.ezeon.capp.domain.User;
import com.ezeon.capp.service.UserService;
import com.ezeon.capp.service.jdbc.UserServiceImpl;
public class TestService {
    public static void main(String[] args) {
        //UNIT Testing; JUNIT framework can be used for unit testing
       UserService service=new UserServiceImpl();
       User u=new User();
       u.setName("Amit");
       u.setPhone("45454");
       u.setEmail("amit@gmail.com");
       u.setAddress("Mumbai");
       u.setLoginName("amit");
       u.setPassword("amit");
       service.register(u);
    }

}
