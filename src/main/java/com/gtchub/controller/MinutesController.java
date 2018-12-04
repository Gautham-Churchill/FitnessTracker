package com.gtchub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gtchub.model.Minutes;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Minutes minutes) {
		
		System.out.println(minutes.getMinutes());
		
		return "addMinutes";
	}
}
