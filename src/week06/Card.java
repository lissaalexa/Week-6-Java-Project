package week06;

public class Card {
//card class represents a playing card in the game
	
	//Question 1ai
	private int value;
	private String name;
	
	public Card(int newValue, String newName) {
	//state the card with a given value and name
		this.value = newValue;
		//value means the rank of the card
		this.name = newName;
		//name means for example, King or Queen
	}

	//Question 1aii
	//getter for getting value of the card
	public int getValue() {
		return value;
	}
	
	//getter for setting value of the card
	public void setValue(int newValue) {
		value = newValue;
	}
	
	//getter for getting the name of the players
	public String getName() {
		return name;
	}
	
	//setter for updating the name of the card
	public void setName(String newName) {
		name = newName;
	}
	
	//method to describe the card's name
	public void describe() {
		System.out.println(name);
	}
}