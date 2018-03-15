
public class Card 
{
	//fields
	private String rank;
	private String suit;
	private int pointValue;
	
	Card(String rank, String suit, int pointValue) 
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	//number 3
	//check if this card equals another in value
	public boolean equals(Card otherCard)
	{
		if(otherCard.getPointValue() == this.pointValue)		
		{
			return true;
		} 
		return false;
	}
	
	//return an appropriate string
	public String toString() 
	{
		return rank + ", " + suit + ", " + pointValue;
	}
	
	//getters and setters
	public String getRank() 
	{
		return rank;
	}
	
	public void setRank(String rank) 
	{
		this.rank = rank;
	}

	public String getSuit() 
	{
		return suit;
	}
	
	public void setSuit(String suit) 
	{
		this.suit = suit;
	}
	
	public int getPointValue() 
	{
		return pointValue;
	}
	
	public void setPointValue(int pointValue) 
	{
		this.pointValue = pointValue;
	}
	
}
