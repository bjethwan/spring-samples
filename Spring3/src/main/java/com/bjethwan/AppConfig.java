package com.bjethwan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bjethwan.games.BaseballGame;
import com.bjethwan.games.Game;
import com.bjethwan.teams.Team;


@Configuration
@ComponentScan(basePackages="com.bjethwan.teams")
public class AppConfig {
	
	@Autowired @Qualifier("redSox")
	private Team homeTeam;
	
	@Autowired @Qualifier("cubs")
	private Team awayTeam;
	
	@Bean(initMethod="playNationalAnthem", destroyMethod="publishResutls")
	Game game(){
		return new BaseballGame(homeTeam, awayTeam);
	}
	
}
