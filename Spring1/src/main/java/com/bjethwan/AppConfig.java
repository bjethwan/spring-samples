package com.bjethwan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {
	
	@Autowired Environment env;
	
	@Bean
	Game game(){
		BaseballGame baseballGame = new BaseballGame(redSox(), cubs());
		System.out.println(env.getProperty("stadium"));
		System.out.println(env.getProperty("year"));
		baseballGame.setStadium(env.getProperty("stadium"));
		baseballGame.setYear(env.getProperty("year"));
		return baseballGame;
	}
	
	@Bean
	Team redSox(){
		return new RedSox();
	}
	
	@Bean
	Team cubs(){
		return new Cubs();
	}
	
	@Bean
	Team royals(){
		return new Royals();
	}
}


