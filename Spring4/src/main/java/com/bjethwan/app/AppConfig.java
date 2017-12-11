package com.bjethwan.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.bjethwan.games.BaseballGame;
import com.bjethwan.games.Game;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.bjethwan")
@PropertySource("classpath:app.properties")
public class AppConfig {
	
	@Autowired
	Environment env;
		
	@Bean
	public Game game(){
		return new BaseballGame(env.getProperty("stadium"), env.getProperty("year"));
	}

}

