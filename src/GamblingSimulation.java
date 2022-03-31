import java.util.Scanner;

public class GamblingSimulation {
	int everydayStake=100;
	int betpergame=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	win;
		int loss;
		int winrate=0;
		int totalamount=100;
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter a no of turns" );
	      int play = s.nextInt();
		
		  
		for (int i=1;i<=play;i++)
		{
			win =(int) Math.floor(Math.random()*10)%2;
			if(win==1)
				{
			winrate=winrate+win;
			System.out.println(" gambler won this turn  "  +win);
			totalamount=totalamount+1;
			System.out.println(" "  +totalamount);
			
					}
			else if (win==0)
				{int a=-1;
			winrate=winrate-win;
			System.out.println(" gambler looses this turn " +a);
			totalamount=totalamount-1;
			System.out.println(" "  +totalamount);
				}
		}
		  
		if(totalamount>=150) 
		{
			System.out.println("gambler won the game " +totalamount);
		}
		else if (totalamount<=50)	
		{
			System.out.println("gambler looses the game " +totalamount);
		}
		else
		{
			System.out.println("gambler needs to play more to get the result");
		}
	}

}
