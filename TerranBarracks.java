/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class TerranBarracks extends FighterBarracks
{
	public Fighter buildFighter(int type)
	{
		Fighter fighter = null;
	
		if(type == FC.MARINE)
			fighter = new Marine();
		else if(type == FC.MARAUDER)
			fighter = new Marauder();
		else if(type == FC.REAPER)
			fighter = new Reaper();
		else if(type == FC.HELLION)
			fighter = new Hellion();
		else if(type == FC.SIEGETANK)
			fighter = new SiegeTank();
		else if(type == FC.THOR)
			fighter = new Thor();
		else if(type == FC.VIKING)
			fighter = new Viking();
		else if(type == FC.RAVEN)
			fighter = new Raven();
		else if(type == FC.BATTLECRUISER)
			fighter = new BattleCruiser();
		else if(type == FC.BANSHEE)
			fighter = new Banshee();

		return fighter;	
	}
	
	public int checkFighterPrice(int type)
	{
		int cost = 0;
		
		if(type == FC.MARINE)
			cost =  FC.MARINE_COST;
		else if(type == FC.MARAUDER)
			cost = FC.MARAUDER_COST;
		else if(type == FC.REAPER)
			cost = FC.REAPER_COST;
		else if(type == FC.HELLION)
			cost = FC.HELLION_COST;
		else if(type == FC.SIEGETANK)
			cost = FC.SIEGETANK_COST;
		else if(type == FC.THOR)
			cost = FC.THOR_COST;
		else if(type == FC.VIKING)
			cost = FC.VIKING_COST;
		else if(type == FC.RAVEN)
			cost = FC.RAVEN_COST;
		else if(type == FC.BATTLECRUISER)
			cost = FC.BATTLECRUISER_COST;
		else if(type == FC.BANSHEE)
			cost = FC.BANSHEE_COST;
	
		return cost;
	}




}