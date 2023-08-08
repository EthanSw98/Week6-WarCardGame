package warGame;

import java.util.ArrayList;
import java.util.List;

public class WarApp {

	public static void main(String[] args) {
		
		
		
		Deck Deck1 = new Deck();
		 // Deck1.describe();
		Player Player1 = new Player( "Ricky");
		Player Player2 = new Player("Bobby");
		
		Game Game = new Game(Player1, Player2, Deck1);
		
		
		
	}

}
