package com.divakar.flight_reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
}
