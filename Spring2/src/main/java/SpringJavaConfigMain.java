import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bjethwan.AppConfig;
import com.bjethwan.games.Game;


public class SpringJavaConfigMain {
	public static void main(String[] args) {

		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Game game = context.getBean("game", Game.class);
		
		System.out.println(game.playGame());
		
	}	
}
