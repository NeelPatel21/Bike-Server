package com.bike.endpoint.admin;

import com.bike.annotation.Mock;
import com.bike.data.bean.EndUserJPA;
import com.bike.service.EndUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Mock
@Controller
@RequestMapping("html-test")
public class SimpleHtmlTestController {

//    public AdminTestController(){
//        System.out.println("ccccdadwadadwdadwadadwdaddaddawd");
//    }
    @Autowired
    private EndUserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView test(ModelAndView mv){
        mv.setViewName("test1");
        return mv;
    }
}
