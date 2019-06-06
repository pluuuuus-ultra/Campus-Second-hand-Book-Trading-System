package com.gyf.bookstore.web.servlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gyf.bookstore.exception.UserException;
import com.gyf.bookstore.service.UserService;

class testlogin {

	@Test
	void test() {
		UserService userservice=new UserService();
		String username="aa";
		String password="a";
		try {
			userservice.login(username, password);
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
