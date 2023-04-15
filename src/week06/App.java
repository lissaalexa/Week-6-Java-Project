package week06;

public class App {

	//Question 2
	public static void main(String[] args) {
		//Question 2a
		Deck deck = new Deck();
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		deck.shuffle();
		
		//Question 2b
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		//Question 2c
		for (int i = 0; i < 26; i++) {
			System.out.println("************** Round " + i + " **************");
			Card player1Card = player1.flip();
				player1Card.describe();
			Card player2Card = player2.flip();
				player2Card.describe();
			if (player1Card.getValue() > player2Card.getValue()) {	//Question 2d
				player1.incrementScore();
				System.out.println(player1.getName() + " Wins!");
			} else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " Wins!");
			} else if (player1Card.getValue() == player2Card.getValue()) {
				//no score :(
				System.out.println("Draw");
			}
		}
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println(player1.getName() + " Score: " + player1.getScore());	//Question 2f
		System.out.println(player2.getName() + " Score: " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {	//Question 2e
			System.out.println(player1.getName() + " Wins! =) ");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " Wins! =) ");
		} else {
			System.out.println("Draw");
		}
	}
}