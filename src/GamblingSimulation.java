
public class GamblingSimulation {
	int everydayStake=100;
	int betpergame=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	win=0;
		int loss=0;
		int winrate=0;
		  win =(int) Math.floor(Math.random()%2);
		if(win==1)
		{
			winrate=winrate+win;
		}
		else if(win==0)
		{
			winrate=winrate-1;
		}
	
			
		

	}

}
