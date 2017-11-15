package com.bike.data.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="end_users")
final public class EndUserJPA {

//schema
    @Id
    @GenericGenerator(name = "userId_gen", strategy = "sequence")
    @GeneratedValue(generator = "userId_gen")
    @Column(name = "user_id", unique = true, updatable = false, nullable = false)
    private long userId;

    @Column(name = "user_name", nullable = false, unique = true, length = 50)
    private String userName;

    @Column(name = "user_email", nullable = false, unique = true, length = 50)
    private String emailId;

    @Column(name = "user_pass", nullable = false, length = 50)
    private String passwd;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Deprecated
    public EndUserJPA(long id){
        this.userId = id;
    }

    public EndUserJPA(){}

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EndUserJPA that = (EndUserJPA) o;

        if (userId != that.userId) return false;
        if (!getUserName().equals(that.getUserName())) return false;
        if (!getEmailId().equals(that.getEmailId())) return false;
        if (getPasswd() != null ? !getPasswd().equals(that.getPasswd()) : that.getPasswd() != null)
            return false;
        if (getFirstName() != null ? !getFirstName().equals(that.getFirstName()) : that.getFirstName() != null)
            return false;
        return getLastName() != null ? getLastName().equals(that.getLastName()) : that.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + getUserName().hashCode();
        result = 31 * result + getEmailId().hashCode();
        result = 31 * result + (getPasswd() != null ? getPasswd().hashCode() : 0);
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        return result;
    }

}
