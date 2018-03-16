import java.util.ArrayList;

public class Runner 
{
	//when u print out a card you dont actually call the tostring method
	
	
	public static void main(String[] args)
	{
		//needed to initialize ?
		//this.unDealt = new ArrayList<Card>();
		//this.Dealt = new ArrayList<Card>();
		
		String[] rank = {"2", "3", "4"};
							//, "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
		String[] suit = {"diamond", "heart"};
		int[] pointValue = {1, 2, 3};
							//4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
		
		new Deck(rank, suit, pointValue);
		System.out.println(Card);
		
	}
}
