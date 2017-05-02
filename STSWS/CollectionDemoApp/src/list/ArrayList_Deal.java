package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class ArrayList_Deal {

	public static void main(String[] args) {
		int numHands=Integer.parseInt(JOptionPane.showInputDialog("Enter number of Hands"));
		int cardsPerHands=Integer.parseInt(JOptionPane.showInputDialog("Enter cards per hand"));
		
		//Make a 52 normal card deck
		String[] suit = new String[] {"spades", "hearts", "diamonds", "clubs"};
        String[] rank = new String[]
        {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
        List deck = new ArrayList();
        for (int i=0; i<suit.length; i++)
            for (int j=0; j<rank.length; j++)
                deck.add(rank[j] + " of " + suit[i]);
        
         Collections.shuffle(deck);
         
         for(int i=0;i<numHands;i++){
        	 System.out.println(dealHand(deck,cardsPerHands));
         }

	}

	private static List dealHand(List deck, int cardsPerHands) {
		int deckSize=deck.size();
		List handView=deck.subList(deckSize-cardsPerHands, deckSize);
		List hand=new ArrayList(handView);
		handView.clear();
		return hand;
	}

}
