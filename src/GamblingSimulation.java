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
	int wonamount=0;
	int j;
	int lostamount=0;
		
		for(int day=1;day<=2;day++)
		{
			
		
				Scanner s = new Scanner(System.in);
				System.out.println("Enter a no of turns for day "+day );
				int play = s.nextInt();
		
		  
				for (int i=1;i<=play;i++)
				{
					win =(int) Math.floor(Math.random()*10)%2;
					if(win==1)
				{
						winrate=winrate+win;
						totalamount=totalamount+1;
				}
					else if (win==0)
					{
						winrate=winrate-win;
						totalamount=totalamount-1;
						}
				}if(totalamount>=150) 
					{
					
					System.out.println("gambler won the game " +totalamount);
					 wonamount=totalamount-100;
					 System.out.println("the amount gamler won on day "+day+  " is"  +wonamount);
					}
				else if (totalamount<=50)	
					{
					System.out.println("gambler looses the game " +totalamount);
					lostamount=100-totalamount;
					 System.out.println("the amount gamler lost on day "+day+  " is"  +lostamount);
					}
				else
				{
					System.out.println("gambler needs to play more to get the result");
				}
				
							
				}
	}
}
