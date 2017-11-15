package com.bike.service;

import com.bike.annotation.Dev;
import com.bike.annotation.Mock;
import com.bike.data.repo.EndUserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Dev
@Component
public class EndUserServiceImp implements EndUserService {

    @Autowired
    private EndUserRepo repo;

    @Override
    public int createEndUser() {
        return 0;
    }

}
