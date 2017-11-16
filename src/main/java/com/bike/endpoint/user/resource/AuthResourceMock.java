package com.bike.endpoint.user.resource;

import com.bike.annotation.Mock;
import com.bike.endpoint.user.model.EndUserEUA;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@Mock
@RestController
@RequestMapping("authentication")
public class AuthResourceMock {

    @RequestMapping(value = "/{userName}", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> login(@RequestBody EndUserEUA user, String userName){
        ResponseEntity<String> response =
                new ResponseEntity<>("xxxxxxxxxxxxxxxx", HttpStatus.ACCEPTED);
        return response;
    }

    @RequestMapping(value = "/{userName}",method = RequestMethod.DELETE,
            produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> logout(@RequestBody String token, String userName){
        ResponseEntity<String> response =
                new ResponseEntity<String>(null,null, HttpStatus.OK);
        return response;
    }

}
