public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
			
		// TO BE IMPLEMENTED
	}

	public void player1Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
	}

	public void player2Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
	}

	private String getScore(int points) 
	{
		if(points == 1)
		{
			return "15";
		}
		else if(points == 2)
		{
			return "30";
		}
		// TO BE IMPLEMENTED
		return "";
	}
	
	public String getScore() 
	{
		// Scores format: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"
		
		

		// TO BE IMPLEMENTED
		return "";
	}
}
