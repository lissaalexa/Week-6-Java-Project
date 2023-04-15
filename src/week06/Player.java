package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {

	//Question 1ci
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	//Question 1cii-1
	public void describe() {

		System.out.println("****************************");
		System.out.println("Name: " + this.name + " Score: " + this.score);
		System.out.println("Hand: ");
		for (Card card : this.hand) {
			card.describe();
		}
		System.out.println("****************************");
	}
	
	//Question 1cii-2
	public Card flip() {
		Card flipCard = hand.get(0);
		hand.remove(0);
		
		return flipCard;
	}
	
	//Question 1cii-3
	public void draw(Deck deck) {
		Card theCard = deck.draw();		
		hand.add(theCard);
	}

	//Question 1cii-4
	public void incrementScore() {
		this.score++;
	}
}