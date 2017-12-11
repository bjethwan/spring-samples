package com.bjethwan.games;

import com.bjethwan.teams.Team;

public interface Game {
	
	String playGame();
	
	 Team getHome();
	 void setHome(Team home);

	 Team getAway();
	 void setAway(Team away);
}
