package com.bike.service;

import com.bike.data.repo.EndUserRepo;

import org.springframework.beans.factory.annotation.Autowired;

public class EndUserServiceImp implements EndUserService {

    @Autowired
    private EndUserRepo repo;

    @Override
    public int createEndUser() {
        return 0;
    }

}
