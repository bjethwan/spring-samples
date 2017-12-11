package com.bjethwan.games;

import com.bjethwan.teams.Team;

public class BaseballGame implements Game{

	private Team homeTeam;
	private Team awayTeam;
	private String stadium;
	private String year;
	
	public BaseballGame(String stadium, String year){
		this.stadium=stadium;
		this.year=year;
	}
	
	@Override
	public String playGame() {
		String ret = (Math.random()<0.5)?getHome().getName():getAway().getName();
		ret = String.format("Year: %s, Stadium: %s - %s  wins", year, stadium, ret);
		return ret;
	}

	@Override
	public Team getHome() {
		return homeTeam;
	}
	@Override
	public void setHome(Team home) {
		this.homeTeam = home;
	}
	@Override
	public Team getAway() {
		return awayTeam;
	}
	@Override
	public void setAway(Team away) {
		this.awayTeam=away;
	}

}
