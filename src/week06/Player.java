package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
//player class represents the players playing the game
	
	//Question 1ci
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	//getter method for getting the player's name
	public String getName() {
		return this.name;
	}
	
	//getter method for getting the player's score
	public int getScore() {
		return this.score;
	}
	
	//Question 1cii-1
	//method to describe the plater's name, score and hand
	public void describe() {

		System.out.println("****************************"); //break
		System.out.println("Name: " + this.name + " Score: " + this.score);
		System.out.println("Hand: ");
		for (Card card : this.hand) {
			card.describe();
		}
		System.out.println("****************************"); //break
	}
	
	//Question 1cii-2
	//method to flip the top card from the player's hand
	public Card flip() {
		Card flipCard = hand.get(0);
		hand.remove(0);
		
		return flipCard;
	}
	
	//Question 1cii-3
	//method to draw a card from the deck and adds the card to the player's hand
	public void draw(Deck deck) {
		Card theCard = deck.draw();		
		hand.add(theCard);
	}

	//Question 1cii-4
	//increments the plater's score by one
	public void incrementScore() {
		this.score++;
	}
}