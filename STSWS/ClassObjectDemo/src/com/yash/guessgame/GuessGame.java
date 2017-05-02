package com.yash.guessgame;

public class GuessGame {
	// create players
	private Player player1;
	private Player player2;
	private Player player3;
	
	public void startGame() {
		// assign player objects to each player
		player1=new Player();
		player2=new Player();
		player3=new Player();
		
		// create three separate guess for each individual player and assign initial guess as 0
		
		int guessForPlayer1=0;
		int guessForPlayer2=0;
		int guessForPlayer3=0;
		
		// create threee seperate rights for each individual player and assign initial right as false
		
		boolean rightGuessForPlayer1=false;
		boolean rightGuessForPlayer2=false;
		boolean rightGuessForPlayer3=false;
		
		// make the target number that player have to guess
		
		int targetNumber=(int)(Math.random()*10);
		System.out.println("I am thinking of a number from 0 to 9......");
		
		while(true){
			System.out.println("Number to guess is : "+targetNumber);
			// now call each players guess() method
			player1.guess();
			player2.guess();
			player3.guess();
			
			guessForPlayer1=player1.getGuessNumber();
			System.out.println("Player one guessed : "+guessForPlayer1);
			
			guessForPlayer2=player2.getGuessNumber();
			System.out.println("Player Two guessed : "+guessForPlayer2);
			
			guessForPlayer3=player3.getGuessNumber();
			System.out.println("Player Three guessed : "+guessForPlayer3);
			
			
			if(guessForPlayer1==targetNumber){
				rightGuessForPlayer1=true;
			}
			
			if(guessForPlayer2==targetNumber){
				rightGuessForPlayer2=true;
			}
			
			if(guessForPlayer3==targetNumber){
				rightGuessForPlayer3=true;
			}
			
			// stop guessing more if any of the player got the current guess
			
			if(rightGuessForPlayer1 || rightGuessForPlayer2|| rightGuessForPlayer3){
				System.out.println("We have a winner");
				System.out.println("Player 1 got it right : "+rightGuessForPlayer1);
				System.out.println("Player 2 got it right : "+rightGuessForPlayer2);
				System.out.println("Player 3 got it right : "+rightGuessForPlayer3);
				System.out.println("Game is over");
				break;
				
			}
			else{
				// player will have to try again
				System.out.println("Player will have to try again");
			}
			
			
			
			
		}
		
		
		
	}

}
