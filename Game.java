abstract class Game 
{
 
    protected int numberOfPlayers;
	 protected Commander player1;
	 protected Commander player2;
    abstract void initializeGame();
    abstract void setFighterForRound(Commander player);
	 abstract void makePlay(Commander player);
	 abstract void battle();
    abstract boolean endOfGame();
    abstract void printWinner();
 
    /* A template method : */
    public final void playGame(int num) 
	 {
        this.numberOfPlayers = num;
        initializeGame();
		  
        int j = 0;
        while (!endOfGame()) 
		  {
		  		if(j == 0)
            	setFighterForRound(this.player1);
				else if(j == 1)
				{
					setFighterForRound(this.player2);	
					battle();
				}
					
            j = (j + 1) % numberOfPlayers;
        }
        printWinner();
    }
}