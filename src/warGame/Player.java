package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	int Score = 0;
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void describe() {
		
		System.out.println(this.name + ", Your score is: " + this.Score);
		System.out.println("The cards in your hand are: ");
		
		for( Card card : this.hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	public void increaseScore() {
		this.Score += 1;
	}
}


