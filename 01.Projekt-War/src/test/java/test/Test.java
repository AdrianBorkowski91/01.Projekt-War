package test;

import java.util.List;

import org.junit.Assert;

import deck.Deck;
import game.Game;
import model.Card;

public class Test {

	@org.junit.Test
	public void howManycards() {
		List<Card> cards= Deck.generateDeck();
		
		Assert.assertEquals(56, cards.size());
	}
	
	@org.junit.Test
	public void gameResult(){
		Card card1= new Card("2", 1);
		Card card2= new Card("3", 2);
		Card card3= new Card("Joker", 14);
		Card card4= new Card("K", 12);
		Card card5= new Card("A", 13);
		Card card6= new Card("A", 13);
		
		int wynik1[]= Game.result(card1, card2);
		int wynik2[]= Game.result(card3, card4);
		int wynik3[]= Game.result(card5, card6);
				
		int spodziewanyWynik1[]= {0, 1};
		int spodziewanyWynik2[]= {1, 0};
		int spodziewanyWynik3[]= {0, 0};
		
		Assert.assertEquals(spodziewanyWynik1[0], wynik1[0]);
		Assert.assertEquals(spodziewanyWynik1[1], wynik1[1]);
		Assert.assertEquals(spodziewanyWynik2[0], wynik2[0]);
		Assert.assertEquals(spodziewanyWynik2[1], wynik2[1]);
		Assert.assertEquals(spodziewanyWynik3[0], wynik3[0]);
		Assert.assertEquals(spodziewanyWynik3[1], wynik3[1]);
	}

}
