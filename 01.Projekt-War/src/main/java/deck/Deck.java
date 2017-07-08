package deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Card;

public class Deck {

	private static List<Card> deck;
	
	public static List<Card> generateDeck(){
		
		deck= new ArrayList<Card>();
		
		String[] name={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "Joker"};
		int[] value={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		for(int i=0; i<14; i++){
			for(int j=0; j<4; j++){
				Card card= new Card(name[i], value[i]);
				deck.add(card);
			}	
		}
		Collections.shuffle(deck);
		return deck;
	}
	
	
	
}
