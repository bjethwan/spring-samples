package com.bjethwan.teams;

import org.springframework.stereotype.Component;

@Component
public class Royals implements Team{

	@Override
	public String getName() {
		return "Royals";
	}

}
