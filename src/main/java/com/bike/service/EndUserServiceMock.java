package com.bike.service;

import com.bike.annotation.Mock;
import com.bike.data.bean.EndUserJPA;

import org.springframework.stereotype.Component;

@Mock
@Component
public class EndUserServiceMock implements EndUserService {

    @Override
    public int createEndUser(EndUserJPA newUser) {
        return 0;
    }

    @Override
    public EndUserJPA getUser(String userName) {
        EndUserJPA user = new EndUserJPA(-1);
        user.setEmailId("mock@email.com");
        user.setUserName("mockuser");
        user.setFirstName("mockfirstname");
        user.setLastName("mocklastname");
        user.setPasswd("mockpasswd");
        return user;
    }
}
