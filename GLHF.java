import java.util.*;
/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/

class GLHF extends Game 
{
	private static final int HOST = 1;
	private static final int CLIENT = 2;
	private Scanner kb;
	private int numPlayers;
	private int choice;
	private int money;
	//private Commander player1;
	//private Commander player2;
	
	public GLHF()
	{
		super.numberOfPlayers = 2;
		this.kb = new Scanner(System.in);

	}
	
 
    /* Implementation of necessary concrete methods */
    void initializeGame() 
	 {		
	 	System.out.println("\n************************************************");
		System.out.println("*        WELCOME TO THE STARCRAFT ARENA        *");
		System.out.println("************************************************\n");


		askForInstructions();
		if(!localOrSocket())
		{
			int netMode = askToHostOrJoin();
			int portNum = 0;
			if(netMode == HOST)
			{
				portNum = getPortNumber();
			
			}
			else if(netMode == CLIENT)
			{
				portNum = getPortNumber();
				//get computer ip/name from user
			
			}
		}
		money = getGameMoney();
		player1 = getCommander(1);
		setupFighter(player1);
		player2 = getCommander(2);
		setupFighter(player2);
		addUpgrades(player1);
		addUpgrades(player2);
		
	 	System.out.println("\n************************************************");
		System.out.println("*             LET THE BATTLES BEGIN            *");
		System.out.println("************************************************\n");
	 }
	 void addUpgrades(Commander com)
	 {
	 
	 
	 
	 
	 
	 
	 }
	 int getPortNumber()
	 {
	 	int port = 0;
		String inputStr = "";
		do{
		 	System.out.print("Enter port: ");
		 	inputStr = kb.nextLine();
			try{
				port = Integer.parseInt(inputStr);
			}catch(Exception e){port = -1;}
			if(port < 0)
				System.out.println("Error: Port must contain numeric characters only and be greater than 0");
		}while(port < 0);
	 	return port;
	 }
	 
	 private boolean localOrSocket()
	 {
		 String inputStr = "";
			int choice = 0;
			do{
				System.out.println("\nWould you like to play local or a hosted game?");
				System.out.println("1: Local");
				System.out.println("2: Hosted");
				System.out.print("Choice: ");
				inputStr = kb.nextLine();
				
				try{
					choice = Integer.parseInt(inputStr);
				}catch(Exception imabitch){choice = -1;}
			 	if(choice < 1 || choice > 2)
					System.out.println("Error: Please enter 1 or 2");
			}while(choice < 1 || choice > 2);
			
			if(choice == 2)
				return false;
			return true;
	 }
	 int askToHostOrJoin()
	 {
		String inputStr = "";
		int choice = 0;
		do{
			System.out.println("\nWould you like to host or join a match?");
			System.out.println("1: Host");
			System.out.println("2: Join");
			System.out.print("Choice: ");
			inputStr = kb.nextLine();
			
			try{
				choice = Integer.parseInt(inputStr);
			}catch(Exception imabitch){choice = -1;}
		 	if(choice < 1 || choice > 2)
				System.out.println("Error: Please enter 1 or 2");
		}while(choice < 1 || choice > 2);
	 
	 	return choice;
	 }
	 void setFighterForRound(Commander com) 
	 {
	 	String inputStr = "";
		int maxChoice = 0;
		int choice = 0;
		do{
		 	System.out.println("\n"+com.getName()+", please choose your Fighter for this round...");
			maxChoice = com.printFighters();
			System.out.print("Choice: ");
			inputStr = kb.nextLine();
			try{
				choice = Integer.parseInt(inputStr);
			}catch(Exception e){choice = -1;}
			
			if(choice < 1 || choice > maxChoice)
				System.out.println("Error: Please enter 1-"+maxChoice);
			
		}while(choice < 1 || choice > maxChoice);
		
		com.setCurFighter(com.getFighterAtIndex(choice -1));
	 }
	 
	 
	 
	 void battle()
	 {
	 	Fighter p1 = player1.getCurFighter();
		Fighter p2 = player2.getCurFighter();
		System.out.println();
		
		//if player 1's fighter is faster than player 2's
		if(player1.getCurFighter().getSpeed() > player2.getCurFighter().getSpeed()) 
		{
	
			p1.attack(p2);
			System.out.println();
		
			if(p2.getHealth() <= 0)
			{
				System.out.println(player2.getName() + "'s "+p2+" has been abolished!!");
				player2.removeCurFighter(player2.getCurFighter());
			}
			else if(p2.getHealth() > 0)
				System.out.println(player2.getName() + "'s "+p2+" has "+player2.getCurFighter().getHealth()+" health!");

			p2.attack(p1);
			if(p1.getHealth() <= 0)
			{
				System.out.println(player1.getName() + "'s "+p1+" has been abolished!!");
				player1.removeCurFighter(player1.getCurFighter());			
			}
			else if(p1.getHealth() > 0)
				System.out.println(player1.getName() + "'s "+p1+" has "+player1.getCurFighter().getHealth()+" health!");

		}
	
		//if player 2's fighter is faster than player 1's
		if(player1.getCurFighter().getSpeed() < player2.getCurFighter().getSpeed()) 
		{
	
			p2.attack(p1);
			
			if(p1.getHealth() <= 0)
			{
				System.out.println(player1.getName() + "'s "+p1+" has been abolished!!");
				player1.removeCurFighter(player1.getCurFighter());			
			}
			else if(p1.getHealth() > 0)
				System.out.println(player1.getName() + "'s "+p1+" has "+player1.getCurFighter().getHealth()+" health!");


			p1.attack(p2);
			System.out.println();
		
			if(p2.getHealth() <= 0)
			{
				System.out.println(player2.getName() + "'s "+p2+" has been abolished!!");
				player2.removeCurFighter(player2.getCurFighter());
			}
			else if(p2.getHealth() > 0)
				System.out.println(player2.getName() + "'s "+p2+" has "+player2.getCurFighter().getHealth()+" health!");



		}
		
		if(player1.getCurFighter().getSpeed() == player2.getCurFighter().getSpeed()) 
		{
	
			p1.attack(p2);
			p2.attack(p1);
			
			System.out.println();
			if(p1.getHealth() <= 0)
			{
				System.out.println(player1.getName() + "'s "+p1+" has been abolished!!");
				player1.removeCurFighter(player1.getCurFighter());			
			}
			else if(p1.getHealth() > 0)
				System.out.println(player1.getName() + "'s "+p1+" has "+player1.getCurFighter().getHealth()+" health!");

			if(p2.getHealth() <= 0)
			{
				System.out.println(player2.getName() + "'s "+p2+" has been abolished!!");
				player2.removeCurFighter(player2.getCurFighter());
			}
			else if(p2.getHealth() > 0)
				System.out.println(player2.getName() + "'s "+p2+" has "+player2.getCurFighter().getHealth()+" health!");
			

		}

	
	 }//end battle()
	 
	 
	 void makePlay(Commander com)
	 {
	 }
	 
	 boolean endOfGame() 
	 {	  
		return (player1.getFighters().size() == 0 || player2.getFighters().size() == 0);
	 }
	 
	 void printWinner() 
	 {
	 	System.out.println("\n\n************************************************");

	 	if(player1.getFighters().size() > player2.getFighters().size())
			System.out.println("          "+player1.getName()+" is VICTORIOUS!!         ");
		else if(player1.getFighters().size() < player2.getFighters().size())
			System.out.println("          "+player2.getName()+" is VICTORIOUS!!         ");
		else
			System.out.println("*                  TIE GAME!!                  *");
	 	System.out.println("************************************************\n");
	 }
	 
	private int getGameMoney()
	{
		int choice = 0;
		String inputStr = "";
		
		do{
			System.out.println("\nSelect Game Size");
			System.out.println("1: Skirmish");
			System.out.println("2: Battle");
			System.out.println("3: War");

			System.out.print("Choice: ");			
			inputStr = kb.nextLine();
			
			try{
				choice = Integer.parseInt(inputStr);
			}catch(Exception e){choice = -1;}
			
			if(choice < 1 || choice > 3)
				System.out.println("Error: Please enter 1,2, or 3");
		}while(choice < 1 || choice > 3);
		
		if(choice == 1)
			return 100;
		if(choice == 2)
			return 350;
		if(choice == 3)
			return 600;
		return 0;
	}
	private void setupFighter(Commander com)
	{
		getFighters(com);
		do{
			if(wantsItems())		
				getItems(com);
			else
				getFighters(com);
		}while(com.getMoney() > 0);
				
		ArrayList<Fighter> l = com.getFighters();
		for(int i= 0; i < l.size(); i++)
			System.out.println(l.get(i).toString());
	
	}
	private void getFighters(Commander com)
	{
		int choice = 0, maxLen = 0;
		String inputStr = "";
		

		System.out.println("\nOK "+com.getName() + ", please choose a Fighter. You have: "+com.getMoney()+" minerals.");
		do{
			com.getRace().getFighters();
			System.out.print("==> ");
			inputStr = kb.nextLine();
			try{
				choice = Integer.parseInt(inputStr);	
			}catch(Exception youABitch){ choice = -1;}
			if(choice < 1 || choice > 10)
				System.out.println("Choose correctly");				
		}while(choice < 1 || choice > 10);
		
		if(com.getMoney() >= com.getBarracks().checkFighterPrice(choice))
		{
			Fighter fighter = com.getBarracks().buyFighter(choice);
			com.addFighter(fighter);
			com.setMoney(com.getMoney() - fighter.getCost());
		}
		else if(com.getMoney() < com.getBarracks().checkFighterPrice(choice))
			System.out.println("**************  Not enough minerals  **************");

	}
	private boolean wantsItems()
	{
		int choice = 0;
		String inputStr = "";
		do{
			System.out.println("\nDo you want to purchase an Upgrade or Fighter?");
			System.out.println("1: Items\n2: Fighter");
			System.out.print("Choice: ");	
			inputStr = kb.nextLine();
			try{
				choice = Integer.parseInt(inputStr);
			}catch(Exception e){choice = -1;}
			if(choice < 1 || choice > 2)
				System.out.println("Error: enter 1 or 2");
		}while(choice < 1 || choice > 2);
	
		if(choice == 1)
			return true;
			
		return false;
	
	}
	private void getItems(Commander com)
	{
		int choice = 0;
		String inputStr = "";
		do{
			System.out.println("\nOK "+com.getName() + ", please choose an Upgrade. You have: "+com.getMoney()+" minerals.");
			com.getFighterArmory().getUpgrades();

			System.out.print("Choice: ");	
			inputStr = kb.nextLine();
			try{
				choice = Integer.parseInt(inputStr);
			}catch(Exception e){choice = -1;}
			if(choice < 1 || choice > 3)
				System.out.println("Error: enter 1 - 4");
		}while(choice < 1 || choice > 3);
		
		if(com.getMoney() >= com.getFighterArmory().checkUpgradePrice(choice))
		{
			Upgrade upgrade = com.getFighterArmory().buyUpgrade(choice);
			//com.addUpgrade(upgrade);
			com.setMoney(com.getMoney() - upgrade.getCost());
		}
		else if(com.getMoney() < com.getFighterArmory().checkUpgradePrice(choice))
			System.out.println("**************  Not enough minerals  **************");
	
	}
	private Commander getCommander(int player)
	{
		Commander com = new Commander();
		int choice = 0;
		String inputStr = "";
		com.setMoney(money);
		
		System.out.print("\nPlayer "+player+"\n Enter your Commander Name: ");
		com.setName(kb.nextLine());
		
		do{
			System.out.println("\nSelected your race...");
			System.out.println("1: Terran");
			System.out.println("2: Protoss");
			System.out.println("3: Zerg");
			System.out.print("Choice: ");
			
			inputStr = kb.nextLine();
			try{
				choice = Integer.parseInt(inputStr);
			
			}catch(Exception youABitch){ choice = -1;}
			if(choice < 1 || choice > 3)
				System.out.println("Choose 1,2, or 3");	
		}while(choice < 1 || choice > 3);
		
		if(choice == 1)
		{
			com.setRace(new TerranFighterData());
			com.setBarracks(new TerranBarracks());		
		}
		else if(choice == 2)
		{
			com.setRace(new ProtossFighterData());
			com.setBarracks(new ProtossBarracks());
		}
		else if(choice == 3)
		{
			com.setRace(new ZergFighterData());
			com.setBarracks(new ZergBarracks());
		}
		return  com;
	}

	private void askForInstructions()
	{
		String inputStr = "";
		int choice = 0;
		do{
			System.out.println("Do you want to see game instructions? ");
			System.out.println("1: Yes");
			System.out.println("2: No");
			System.out.print("Choice: ");
			inputStr = kb.nextLine();
			try{
				choice = Integer.parseInt(inputStr);
			
			}catch(Exception youABitch)
			{
				choice = -1;
			}
			if(choice < 1 || choice > 2)
				System.out.println("Choose 1 or 2");	

		}while(choice < 1 || choice > 2);
		
		if(choice == 1)
			showGameInstructions();
	}

	private void showGameInstructions()
	{
		System.out.println("\nGAME INSTRUCTIONS");
		System.out.println("\nSelect a game size, a race, and then buy units and upgrades.\n" +
				"Each player selects a unit to attack that round and units deal damage based\n" +
				"on their statistics.\n\n" +
				"The game ends when either player loses their last unit.");
	}

}