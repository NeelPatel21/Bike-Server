package com.bike.endpoint.operator;

import com.bike.annotation.Mock;
import com.bike.data.bean.EndUserJPA;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Mock
@RestController
@RequestMapping("test")
public class OperatorTestResource {

    @RequestMapping(method = RequestMethod.GET)
    public EndUserJPA getUser(){
        EndUserJPA e= new EndUserJPA(-1);
        e.setUserName("test");
        e.setLastName("test last");
        e.setFirstName("test first");
        e.setEmailId("test email");
        e.setPasswd("test pass");
        return e;
    }
}
