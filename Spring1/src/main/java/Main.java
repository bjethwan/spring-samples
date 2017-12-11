import com.bjethwan.BaseballGame;
import com.bjethwan.Cubs;
import com.bjethwan.RedSox;
import com.bjethwan.Team;


public class Main {
	public static void main(String[] args) {
		
		Team redSox = new RedSox();
		Team cubs = new Cubs();
		
		BaseballGame baseballGame = new BaseballGame(redSox, cubs);
		
		System.out.println(baseballGame.playGame());
		
				

	}
}
