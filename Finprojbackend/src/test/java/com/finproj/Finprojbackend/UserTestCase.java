package com.finproj.Finprojbackend;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.finproj.Finprojbackend.dao.UserDAO;
import com.finproj.Finprojbackend.model.User;



public class UserTestCase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.finproj.Finprojbackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		
		//Insertion TestCase
		User user=new User();
		
		user.setUsername("vishnu");
		user.setPassword("priya");
		user.setCustname("vishnu");
		user.setRole("abc");
		user.setEmail("abc@gmail.com");
		user.setAddress("cdm thillai");
		user.setMobile("764315678");
		user.setEnabled(true);
		
		userDAO.insertUpdateUser(user);		
		System.out.println("User Inserted");
		
		
	}
}
