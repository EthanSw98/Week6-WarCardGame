package warGame;

public class Game {
	
	public Game(Player player1, Player player2, Deck deck) {
		
		
		deck.deal(player1, player2);
		
		//player1.describe();
		//player2.describe();
		
		
		while(!player1.hand.isEmpty()) {
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
			
			System.out.println(player1.name + "'s Card is: ");
			p1Card.describe();
			System.out.println(player2.name + "'s Card is: ");
			p2Card.describe();
			
			if(p1Card.getValue() > p2Card.getValue()) {
				player1.increaseScore();
				System.out.println(player1.name + " Wins This Round!");
			}else {
				player2.increaseScore();
				System.out.println(player2.name + " Wins This Round!");
			}
			
			
			
			System.out.println( player1.name + " Your Score Is: " + player1.Score +" " + player2.name +  " Your Score Is: " + player2.Score);
		}
		
		if( player1.Score > player2.Score) {
			System.out.println(player1.name + " WINS!");
		}else if(player2.Score > player1.Score) {
			System.out.println(player2.name + " WINS!");
		}else {
			System.out.println("ITS A DRAW");
		}

		
}
	
	
	

}
