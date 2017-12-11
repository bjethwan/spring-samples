package com.bjethwan.teams;

import org.springframework.stereotype.Component;

@Component
public class Cubs implements Team{

	@Override
	public String getName() {
		return "Cubs";
	}

}
