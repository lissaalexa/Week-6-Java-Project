package week06;

public class App {

	//Question 2
	public static void main(String[] args) {
		//Question 2a
		//create a new deck with two players
		Deck deck = new Deck();
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		deck.shuffle(); //shuffle deck
		
		//Question 2b
		//distribute cards from the deck to the players
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
			//flip through cards for each player and indicates outcomes per each round
			Card player1Card = player1.flip();
				player1Card.describe();
			Card player2Card = player2.flip();
				player2Card.describe();
			//determines the winner of the round
			if (player1Card.getValue() > player2Card.getValue()) {	//Question 2d
				player1.incrementScore();
				System.out.println(player1.getName() + " Wins!");
				//prints out player 1 wins the round
			} else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " Wins!");
				//prints out player 2 wins the round
			} else if (player1Card.getValue() == player2Card.getValue()) {
				//no score :(
				System.out.println("Draw");
			}
		}
		System.out.println("****************************"); //breaks
		System.out.println("****************************"); //breaks
		//displays score board of both player 1 and player 2
		System.out.println(player1.getName() + " Score: " + player1.getScore());	//Question 2f
		System.out.println(player2.getName() + " Score: " + player2.getScore());
		//determines the winner of the game by using a for loop
		if (player1.getScore() > player2.getScore()) {	//Question 2e
			System.out.println(player1.getName() + " Wins! =) ");
			//prints out if player 1 wins the game, score is greater than player 2
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " Wins! =) ");
			//prints out if player 2 wins the game, score is greater than player 1
		} else {
			System.out.println("Draw");
			//if else, prints out draw for end results of game
		}
	}
}