package warGame;




public class WarApp {

	public static void main(String[] args) {
		
		
		
		Deck Deck1 = new Deck();
		 // Deck1.describe();
		Player player1 = new Player( "Ricky");
		Player player2 = new Player("Bobby");
		
		Game game = new Game(player1, player2, Deck1);
		
		game.run();
		
	}
		
		
		
		
}


