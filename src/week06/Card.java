package week06;

public class Card {

	//Question 1ai
	private int value;
	private String name;
	
	public Card(int newValue, String newName) {
		this.value = newValue;
		this.name = newName;
	}

	//Question 1aii
	public int getValue() {
		return value;
	}
	
	public void setValue(int newValue) {
		value = newValue;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void describe() {
		System.out.println(name);
	}
}