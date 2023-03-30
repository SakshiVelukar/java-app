package com.acs.activitytracker.service;

import org.springframework.stereotype.Service;

import com.acs.activitytracker.model.WelcomeNote;

/**
 * This is a implementation of {@link WelcomeService}, and is just for reference
 * for the upcoming development for trainees.
 * 
 * TODO Delete this after actual development starts
 * 
 * @author ramprasad.bairi
 * 
 */
@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public WelcomeNote getWelcomeMessage() {
		return new WelcomeNote("welcome", "Greetings! All the very best for your first project");
	}

}
