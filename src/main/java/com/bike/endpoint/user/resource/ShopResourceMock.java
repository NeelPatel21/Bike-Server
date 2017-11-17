package com.bike.endpoint.user.resource;

import com.bike.annotation.Mock;
import com.bike.endpoint.user.model.EndUserEUA;
import com.bike.endpoint.user.model.ShopEUA;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Mock
@RestController
@RequestMapping("shop")
public class ShopResourceMock {

    List<ShopEUA> l = new ArrayList<>();
    public ShopResourceMock(){
        for(int i=0; i<4; i++){
            ShopEUA shopEUA = new ShopEUA();
            shopEUA.setShopId(i);
            shopEUA.setShopName("shop "+i);
            shopEUA.setOpen(i%2==0);
            shopEUA.setLatitude(((double)i/2));
            shopEUA.setLongitude(((double)i/3));
            l.add(shopEUA);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ShopEUA>> getAllShops(){
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<List<ShopEUA>> response =
                new ResponseEntity<List<ShopEUA>>(l, headers, HttpStatus.OK);
        return response;
    }

    @RequestMapping(value = "/{shopId}",method = RequestMethod.GET)
    public ResponseEntity<ShopEUA> getShop(Long shopId){
        ResponseEntity<ShopEUA> response =
                new ResponseEntity<>(l.get(0), HttpStatus.OK);
        return response;
    }

}
