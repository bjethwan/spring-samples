import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bjethwan.app.AppConfig;
import com.bjethwan.games.Game;
import com.bjethwan.teams.Team;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Team cubs = (Team)context.getBean("cubs");
		Team royals = (Team)context.getBean("royals");
		Team redSox = (Team)context.getBean("redSox");
		
		Game game = (Game)context.getBean("game");
		
		game.setHome(redSox);
		game.setAway(royals);
		System.out.println(game.playGame());
		
		game.setHome(redSox);
		game.setAway(cubs);
		System.out.println(game.playGame());
		
		game.setHome(cubs);
		game.setAway(royals);
		System.out.println(game.playGame());
		
		
		context.close();
	}
}
