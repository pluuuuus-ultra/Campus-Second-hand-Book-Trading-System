/*package com.gyf.bookstore.web.servlet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gyf.bookstore.domain.*;
import com.gyf.bookstore.exception.UserException;
import com.gyf.bookstore.service.*;

class test {

	@Test
	void test() {
		User user=new User();
		user.setId(100);
		user.setUsername("James");
		user.setPassword("123456");
		UserService userservice=new UserService();
		try {
			userservice.register(user);
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserService userservise = new UserService();
		try {
			userservise.findUserById("1");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}*/
