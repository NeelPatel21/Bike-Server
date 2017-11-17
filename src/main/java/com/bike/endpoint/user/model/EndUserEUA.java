package com.bike.endpoint.user.model;

import com.bike.endpoint.util.bean.Link;
import com.bike.endpoint.util.bean.RestStatus;

import java.util.ArrayList;
import java.util.List;

public class EndUserEUA extends RestStatus{

    private String userName;
    private String firstName;
    private String lastName;
    private String emailId;
    private String passWd;
    private List<Link> links = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public List<Link> getLinks() {
        return links;
    }

}
