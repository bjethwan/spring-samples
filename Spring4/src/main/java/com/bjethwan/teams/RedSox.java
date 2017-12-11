package com.bjethwan.teams;

import org.springframework.stereotype.Component;

@Component
public class RedSox implements Team {

	@Override
	public String getName() {
		return "Red Sox";
	}

}
