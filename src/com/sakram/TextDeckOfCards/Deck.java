package com.sakram.TextDeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deck {
	
	private ArrayList<Card> cards;

	public Deck() {
		cards = makeDeck();
	}
	
	public ArrayList<Card> makeDeck() {
		ArrayList<Card> newDeck = new ArrayList<Card>();
		String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				Card c = new Card(values[j], suits [i]);
				newDeck.add(c);
			}
		}
		
		return newDeck;
	}
	
	public ArrayList<Card> getDeck() {
		return cards;
	}
	
	public void deal(ArrayList<Card> cards) {
		Scanner s = new Scanner(System.in);
		Collections.shuffle(cards);
		int handSize = 0;

		System.out.println("Enter the number of cards you want to be dealt.");
		while (handSize == 0) {
			String st = s.nextLine();
			if (tryParseInt(st)) {
				int thisMany = Integer.parseInt(st);
				if (thisMany > 0 && thisMany < 53) {
					handSize = thisMany;
				} else {
					System.out.println("Please enter a number between 1 and 52.");
				}
			} else {
				System.out.println("Please enter a valid number between 1 and 52.");
			}
		}

		System.out.println("\rYour hand:");
		
		for (int i = 0; i < handSize; i++) {
			Card c = cards.get(i);
			String name = c.getName(c);
			System.out.println(name);
		}
	}
	
	private boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		}
		catch(NumberFormatException nfe) {
			return false;
		}
	}
}
