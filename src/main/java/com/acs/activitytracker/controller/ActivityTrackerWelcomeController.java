package com.acs.activitytracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acs.activitytracker.model.WelcomeNote;
import com.acs.activitytracker.service.WelcomeService;

/**
 * This package is where all the controllers should be created (have sub
 * packages if required).
 * 
 * This is just for reference for the upcoming development for trainees.
 * 
 * TODO: Delete this after actual development starts
 * 
 * @author ramprasad.bairi
 *
 */
@RestController
@RequestMapping("/welcome")
public class ActivityTrackerWelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	@GetMapping
	public WelcomeNote welcome() {
		return welcomeService.getWelcomeMessage();
	}
}
