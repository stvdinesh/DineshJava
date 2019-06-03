package dinesh;

public class beer 
{
public static void main (String args[]) 
{
	int beerNum=99;
	String word = "bottles";
	while (beerNum > 0)
	{
		if (beerNum == 1) 
		{
			word = "bottleH";
		}
		System.out.println(beerNum + " H "+ word + " of beer on the wallH ") ;
		System.out.println(beerNum + " H "+ word + " of beer.");
		System.out.println("Take one down. H" ) ;
		System.out .println("Pass it around. ") ; 
		beerNum = beerNum - 1;
		if (beerNum > 0) 
		{
		System.out.println(beerNum + " H "+ word + " of beer on che wall H");
		}
		else
		{
		System.out.println("No more bottles of beer on the wallH");
		}
	}
}
}
