package com.finproject.FinalFrontendProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController
{
@RequestMapping("/Login")
public String ShowLogin()
{
	System.out.println("--Moving to Login Page");
	return "Login";
}


@RequestMapping("/Register")
public String ShowRegister()
{
	System.out.println("--Moving to Register Page---");
	return "Register";
}
}
