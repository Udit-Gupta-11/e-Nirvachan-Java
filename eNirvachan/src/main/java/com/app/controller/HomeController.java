package com.app.controller;

import java.time.LocalDateTime;

import javax.persistence.criteria.Fetch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	
	public HomeController() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Home Controller Constructor "+getClass());
	}
	
	@GetMapping("/index")
	public String homePage(Model map) { 
		System.out.println("Inside index Function of "+getClass());
		//System.out.println("in show index page");
		map.addAttribute("server_ts", LocalDateTime.now());
		return "/index";
	}

}
