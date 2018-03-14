
public class Card 
{
	//fields
	private String[] rank;
	private String[] suit;
	private int[] pointValue;
	
	//number 3
	//check if this card equals another in value
	public boolean equals(Card otherCard)
	{
		if(this.Card = otherCard)		//how do you call this card
		{
			return true;
		}
	}
	
	//getters and setters
	public String[] getRank() {
		return rank;
	}
	
	public void setRank(String[] rank) {
		this.rank = rank;
	}

	public String[] getSuit() {
		return suit;
	}
	
	public void setSuit(String[] suit) {
		this.suit = suit;
	}
	
	public int[] getPointValue() {
		return pointValue;
	}
	
	public void setPointValue(int[] pointValue) {
		this.pointValue = pointValue;
	}
	
}
