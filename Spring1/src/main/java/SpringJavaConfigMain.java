import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bjethwan.AppConfig;
import com.bjethwan.Game;


public class SpringJavaConfigMain {
	
	public static void main(String[] args) {

		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Game game = context.getBean("game", Game.class);
		
		System.out.printf("%s wins\n", game.playGame());
		
		System.out.printf("There are %d beans\n", context.getBeanDefinitionCount());
		
		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
	}	
}

