package main;

import java.util.List;
import java.util.Scanner;

import deck.Deck;
import game.Game;
import model.Card;

public class Main{

	private static Scanner nameSc;
	private static Scanner enterSc;

	public static void main(String[] args) {
		//Wpisz nazwę gracza
		System.out.println("Wpisz nazwę gracza i nacisnij [ENTER] rozpoczynając grę!");
		nameSc = new Scanner(System.in);
		String name = nameSc.nextLine();
		
		List<Card> deck= Deck.generateDeck();
		
		int resultComputer=0;
		int resultPlayer=0;
		
		while(!deck.isEmpty()){
			System.out.println("-------------------------------------------------------------------------------------------------------");
			//Rozpoczęcie rundy
			System.out.println("[ENTER]");			
			enterSc = new Scanner(System.in);
			String enter = enterSc.nextLine();
			
			//Rezultat rundy
			System.out.println(name+": "+deck.get(0).getName()+"  -   computer: "+deck.get(1).getName());
			int wynik[]= Game.result(deck.get(0), deck.get(1));
			String score= wynik[0]==wynik[1] ?  "REMIS!" : wynik[0]>wynik[1] ?  "BRAWO "+name+"!" :"BRAWO computer!";
			System.out.println(score);
			System.out.println(name+": "+wynik[0]+"  -   computer: "+wynik[1]);
			
			//Wynik wszystkich odegranych rund
			resultPlayer+=wynik[0];
			resultComputer+=wynik[1];
			System.out.println("RAZEM:");
			System.out.println(name+": "+resultPlayer+"  -   computer: "+resultComputer);
			
			//Usuniecie kart z talii
			for(int i=1; i<=2; i++)
				deck.remove(0);
			
			
		}
		//Ostateczny wynik
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println(winner(resultPlayer, resultComputer, name));

		
	}
	
	private static String winner(int resultPlayer, int resultComputer, String name){
		String winner="";
		
		if(resultPlayer>resultComputer)
			winner+="KONIEC GRY ZWYCIĘŻYŁ: "+name+"!!!";
		else if(resultPlayer<resultComputer)
			winner+="KONIEC GRY ZWYCIĘŻYŁ: computer!!!";
		else
			winner+="KONIEC GRY, MAMY REMIS!";
		return winner;
	}


}
