package com.yash.guessgame;

public class Player {
	
	private int guessNumber;
	
	public int getGuessNumber() {
		return guessNumber;
	}

	public void guess() {
		guessNumber=(int)(Math.random()*10);
		System.out.println("I am guessing : "+guessNumber);
		
	}

}
