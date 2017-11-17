package com.bike.endpoint.user.resource;

import com.bike.annotation.Mock;
import com.bike.endpoint.user.model.EndUserEUA;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.xml.ws.Response;

@Mock
@RestController
@RequestMapping("user")
public class EndUserResourceMock {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<EndUserEUA> createEndUser(@RequestBody EndUserEUA user,
                                                    UriComponentsBuilder ucb){
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucb.path("/user/").path(user.getUserName()).build().toUri());
        user.setPassWd(null);
        ResponseEntity<EndUserEUA> response =
                new ResponseEntity<EndUserEUA>(user,headers, HttpStatus.CREATED);
        return response;
    }

    @RequestMapping(value = "/{userName}",method = RequestMethod.PUT)
    public ResponseEntity<EndUserEUA> updateEndUser(@RequestBody EndUserEUA user, String userName){
        user.setPassWd(null);
        ResponseEntity<EndUserEUA> response =
                new ResponseEntity<EndUserEUA>(user, HttpStatus.ACCEPTED);
        return response;
    }

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public ResponseEntity<EndUserEUA> getEndUser(String userName){
        HttpHeaders headers = new HttpHeaders();
        EndUserEUA user = new EndUserEUA();
        user.setEmailId("mock@email.com");
        user.setUserName("mockuser");
        user.setFirstName("mockfirst");
        user.setLastName("mocklast");
        user.setPassWd(null);
        user.setStatus("status");
        user.setStatusCode(2);
        ResponseEntity<EndUserEUA> response =
                new ResponseEntity<EndUserEUA>(user, HttpStatus.OK);
        return response;
    }

}
