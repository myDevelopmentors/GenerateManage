package com.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.service.HelloService;

@Controller
public class TestController {
	 @Autowired
	    private HelloService helloService;
	    
	    @RequestMapping(value="/test", method=RequestMethod.GET)
	    public String hello(HttpServletRequest request, HttpServletResponse response) {
	    	System.out.println("...");
	    	String name = helloService.hello();
	    	request.setAttribute("helloname", name);
	    	return "hello";
	    }
}
