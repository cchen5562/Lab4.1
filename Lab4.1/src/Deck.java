import java.util.ArrayList;

public class Deck 
{
	//field
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;

	//the constructor
	
	public Deck(String[] rank, String[] suit, int[] value)
	{
		for (int i = 0; i < rank.length; i++) 
		{
			for (int j = 0; j < suit.length; j++)
			{
				unDealt.add(new Card(rank[i], suit[j], value[i]));
			}
		}
	}
	
	//return true when size of deck is 0
	public boolean isEmpty()
	{
		if((unDealt.size() == 0) && (Dealt.size() == 0))
		{
			return true;
		}
		return false;
	}
	
	//returns the number of cards left to be dealt
	public int size()
	{
		return unDealt.size();
	}
	
	//removes a card from the deck and returns it
	//null if deck is empty
	//dealt card should be added to dealt list and returned
	public Card deal(Card x)
	{
		if(isEmpty() == true)
		{
			return null;
		}
		else 
		{
			unDealt.remove(x); 
			return x;
			Dealt.add(x);		//whyyy
			return x;
		}
	}
	
}
