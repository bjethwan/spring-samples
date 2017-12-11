package com.bjethwan.games;

import com.bjethwan.teams.Team;

public class BaseballGame implements Game {

	private Team home;
	private Team away;
	private String stadium;
	private String year;

	public BaseballGame(String stadium, String year){
		this.stadium=stadium;
		this.year=year;
	}

	@Override
	public String playGame() {
		String ret = (Math.random()<0.5)?
				getHome().getName():
					getAway().getName();

		ret = String.format("Year: %s, Stadium: %s - %s has won the game", year, stadium, ret);
		return ret;
	}

	public Team getHome() {
		return home;
	}
	public void setHome(Team home) {
		this.home = home;
	}
	public Team getAway() {
		return away;
	}
	public void setAway(Team away) {
		this.away = away;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

}
