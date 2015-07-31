package com.sakram.TextDeckOfCards;

public class Card {
	
	private String value;
	private String suit;
	
	public Card(String value, String suit) {
		setValue(value);
		setSuit(suit);
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getName(Card c) {
		String name = c.value + " of " + c.suit;
		return name;
	}
}
