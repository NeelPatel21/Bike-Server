package com.bike.service;

import com.bike.data.bean.EndUserJPA;

public interface EndUserService {
    int createEndUser(EndUserJPA newUSer);
    EndUserJPA getUser(String userName);

}
