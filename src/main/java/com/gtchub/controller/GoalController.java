package com.gtchub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gtchub.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String getGoal(Model model) {
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		return "addGoal";
		
	}
	
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String setGoal(@ModelAttribute("goal") Goal goal) {
		
		System.out.println("Minutes:" + goal.getMinutes());
		return "redirect:addMinutes.html";
		
	}
}