package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//deck class represents the deck of playing cards for the game
	//Question 1bi
	List<Card> cards = new ArrayList<Card>();
	
	//Question 1bii-3
	//initializes 52 playing card deck
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		//creates cards in the deck for each suit and number combination possible
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				String name = number + " of " + suit;
				Card card = new Card(count, name);
				this.cards.add(card);
				count++;
			}
		}
	}
	//Question 1bii
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	//Question 1bii-1
	//method to shuffle the cards in the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//Question 1bii-2
	//method to draw the cards from the deck
	public Card draw() {
		Card drawCard = cards.get(0);
		
		cards.remove(0);
		
		return drawCard;
	}
}