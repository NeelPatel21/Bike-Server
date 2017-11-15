package com.bike.service;

import com.bike.annotation.Dev;
import com.bike.annotation.Mock;
import com.bike.data.bean.EndUserJPA;
import com.bike.data.repo.EndUserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Dev
@Component
public class EndUserServiceImp implements EndUserService {

    @Autowired
    private EndUserRepo repo;

    @Override
    public int createEndUser(EndUserJPA newUSer) {

        if(repo.saveAndFlush(newUSer).getUserId()>0)
            return 0;
        return -1;
    }

    @Override
    public EndUserJPA getUser(String userName) {
        return repo.getByUserName(userName);
    }

}
