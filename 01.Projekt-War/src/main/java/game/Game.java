package game;

import model.Card;

public class Game {
	
	public static int[] result(Card cardPlayer, Card cardComputer){
		int wynik[]= new int[2];
		
		if(cardComputer.getValue()==cardPlayer.getValue()){
			wynik[0]=0;
			wynik[1]=0;
		}
		else if(cardComputer.getValue()<cardPlayer.getValue()){
			wynik[0]=1;
			wynik[1]=0;
		}
		else{
			wynik[0]=0;
			wynik[1]=1;
		}
			
		return wynik;
	}
}
