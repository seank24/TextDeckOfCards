package com.sakram.TextDeckOfCards;

import java.util.ArrayList;

public class Program {
	
	public static void main(String[] args) {
		Deck d = new Deck();
		ArrayList<Card> cards = d.getDeck();
		d.deal(cards);
	}
}
