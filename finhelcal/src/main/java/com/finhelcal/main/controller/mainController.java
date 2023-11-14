package com.finhelcal.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finhelcal.main.model.TakaPoisa;
import com.finhelcal.main.model.User;
import com.finhelcal.main.repository.balanceRepo;
import com.finhelcal.main.repository.userRepo;

@Controller
public class mainController {
	
	@Autowired
	userRepo ur;
	
	@Autowired
	balanceRepo br;

	
	@GetMapping("/home")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/registration")
	public String register() {
		return "register.html";
	}
	
	@GetMapping("/calculator")
	public String logIn() {
		return "finHealthCal.html";
	}
	
	
	@RequestMapping("/calculate")
	public String makeCalculation(@ModelAttribute TakaPoisa tp) {
		
		br.save(tp);
		
		double fhs=((((float)tp.getIncome()-(float)tp.getExpenses())/(float)tp.getIncome())*0.5) + ((((float)tp.getAssets()-(float)tp.getDebts())/(float)tp.getAssets())*0.5);
		if(fhs>0 && fhs<0.5) {
			return "poor.html";
		}
		else if(fhs>0.5 && fhs<0.75) {
			return "moderate.html";
		}
		else if(fhs>0.75 && fhs<=1) {
			return "rich.html";
		}
		else {
			return "wrongInput.html";
		}
		
		
		
	}
	
	
	@RequestMapping("/reg")
	public String calculation(@ModelAttribute User user) {
		
		ur.save(user);
		System.out.println(user);
		return "home.html";
	}
}
