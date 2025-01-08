package com.feedback.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.feedback.model.feedback;
import com.feedback.model.user;
import com.feedback.service.feedbackservice;
import com.feedback.service.userservice;

import jakarta.servlet.http.HttpSession;



@Controller
public class Maincontroller {
	

	
	@Autowired
	private userservice userservice;
	
	@Autowired
	private feedbackservice feedbackservice;
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("home")
	public String mainhome() {
		return "home";
	}
	
	@GetMapping("register")
	public String showregister()
	{
		return "register";
	}
	
	@GetMapping("login")
	public String showlogin()
	{
		return "login";
	}
	
	@GetMapping("Main")
	public String Main()
	{
		return "Mainpage";
	}
	
	
	@PostMapping("add")
	public String register(@ModelAttribute("u") user u,ModelMap model) {
		//System.out.println("register");
		userservice.saveUser(u);
			model.put("registerMsg", "User registered successfully");
		return "login";
	}
	
	@PostMapping("/login")
	public String Mainpage(ModelMap model, @RequestParam String Username, @RequestParam String Password,HttpSession s) {
		user user = userservice.getUser(Username, Password);
		String a = Username;
		model.put("um", a);
		if(user!=null) {		
			s.setAttribute("id", user);
				return "Mainpage";
		}else{
			model.put("errorMsg", "Invalid username or password");
			return "login";
		}
	}
	
	@GetMapping("admin")
	public String Admin() {
		return "Adminlogin";
	}
	
	@GetMapping("Adminlogin")
	public String Adminlogin(@RequestParam String adminid, @RequestParam String password, ModelMap m) {
		if(adminid.equals("adminlogin") && password.equals("12345678")) {
			
		List<feedback>f =	feedbackservice.getalldetails();
		int kannada = 0; 
		int English = 0; 
		int Hindhi = 0; 
		int Social = 0; 
		int Science = 0; 
		int Math = 0;
		int total = 5*f.size();
		for(feedback ff: f) {
			kannada += ff.getRatingkannada();
			English += ff.getRatingenglish();
			Hindhi += ff.getRatinghindhi();
			Social += ff.getRatingsocial();
			Science += ff.getRatingscience();
			Math += ff.getRatingmath();
		}
		m.put("kannada", kannada);
		m.put("English", English);
		m.put("Hindhi",Hindhi );
		m.put("Social", Social);
		m.put("Science", Science);
		m.put("Math", Math);
		
			return "Adminmain";
		}
		else {
			return "Adminlogin";
		}
	}
	
	@PostMapping("submitFeedback")
	public String submitFeedback(feedback feedback) {
		System.out.println(feedback);
		 feedbackservice.savefeedback(feedback);
		return "home";
	}

}
