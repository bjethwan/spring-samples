package com.bjethwan;

public class BaseballGame implements Game{

	private Team homeTeam;
	private Team awayTeam;
	private String stadium;
	private String year;
	
	public BaseballGame(){}
	
	public BaseballGame(Team homeTeam, Team awayTeam){
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	@Override
	public String playGame() {
		
		String ret =  (Math.random() < 0.5) ? 
				getHomeTeam().getName() : 
					getAwayTeam().getName();
		ret = ret + " played at "+ stadium +" on " + year;
		
		return ret;
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
