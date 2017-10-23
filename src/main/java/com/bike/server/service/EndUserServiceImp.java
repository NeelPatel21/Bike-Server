package com.bike.server.service;

import com.bike.server.data.repo.EndUserRepo;

import org.springframework.beans.factory.annotation.Autowired;

public class EndUserServiceImp implements EndUserService {

    @Autowired
    private EndUserRepo repo;

    @Override
    public int createEndUser() {
        return 0;
    }

}
