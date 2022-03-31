
public class GamblingSimulation {
	int everydayStake=100;
	int betpergame=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	win;
		int loss;
		int winrate=0;
		  win =(int) Math.floor(Math.random()*10)%2;
		  
		  
		if(win==1)
		{
			winrate=winrate+win;
			System.out.println(" gambler won the game "+winrate);
		}
		else if(win==0)
		{
			winrate=winrate-1;
			System.out.println(" gambler looses the game "+winrate);
		}
		  }
			
	

	

}
