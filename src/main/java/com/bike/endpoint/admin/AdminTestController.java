package com.bike.endpoint.admin;

import com.bike.annotation.Mock;
import com.bike.data.bean.EndUserJPA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Mock
@Controller
@RequestMapping("test")
public class AdminTestController {

//    public AdminTestController(){
//        System.out.println("ccccdadwadadwdadwadadwdaddaddawd");
//    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView test(ModelAndView mv){
        EndUserJPA endUserJPA= new EndUserJPA(-1);
        endUserJPA.setUserName("test");
        endUserJPA.setLastName("test last");
        endUserJPA.setFirstName("test first");
        endUserJPA.setEmailId("test email");
        endUserJPA.setPasswd("test pass");
        mv.addObject("myObj",endUserJPA);
        System.out.println(mv.getModel());
        mv.setViewName("test1");
        //System.out.println("csaca");
        return mv;
    }
}
