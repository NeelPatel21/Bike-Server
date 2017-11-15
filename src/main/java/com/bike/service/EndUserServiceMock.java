package com.bike.service;

import com.bike.annotation.Mock;

import org.springframework.stereotype.Component;

@Mock
@Component
public class EndUserServiceMock implements EndUserService {

    @Override
    public int createEndUser() {
        return 0;
    }
}
