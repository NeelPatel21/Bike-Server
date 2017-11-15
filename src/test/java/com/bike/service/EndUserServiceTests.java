package com.bike.service;

import com.bike.ServerApplication;
import com.bike.data.bean.EndUserJPA;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ServerApplication.class)
public class EndUserServiceTests {

	@Autowired
	EndUserService service;

	@Test
	public void usecase1() {
		EndUserJPA user = new EndUserJPA();
		user.setEmailId("test@email.com");
		user.setUserName("testuser");
		user.setFirstName("testfirstname");
		user.setLastName("testlastname");
		user.setPasswd("testpasswd");
		int result=service.createEndUser(user);
		assert result>=0:"error in user create "+result;
		user=null;
		user=service.getUser("testuser");
		assert user!=null:"error in getuser "+user;
	}
}
