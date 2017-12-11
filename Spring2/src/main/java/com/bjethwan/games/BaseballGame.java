package com.bjethwan.games;

import com.bjethwan.teams.Team;

public class BaseballGame implements Game{

	private Team homeTeam;
	private Team awayTeam;
	
	public BaseballGame(){}
	
	public BaseballGame(Team homeTeam, Team awayTeam){
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	@Override
	public String playGame() {
		
		return toString() + ((Math.random() < 0.5) ? 
				getHomeTeam().getName() : 
					getAwayTeam().getName()) + " has won the toss";
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	@Override
	public String toString() {
		
		return "Game: "+ awayTeam.getName() + " at " + homeTeam.getName() + "\n";
	}
}
