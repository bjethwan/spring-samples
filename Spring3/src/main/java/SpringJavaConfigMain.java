import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bjethwan.AppConfig;
import com.bjethwan.games.Game;


public class SpringJavaConfigMain {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Game game = context.getBean("game", Game.class);
		
		System.out.println(game.playGame());
		
		context.close();
	}	
}
