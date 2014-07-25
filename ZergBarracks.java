/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class ZergBarracks extends FighterBarracks
{

	public Fighter buildFighter(int type)
	{
		Fighter fighter = null;
	
		//commented out until all the subclass are made********
		
		if(type == FC.ZERGLING)
			fighter = new Zergling();
		else if(type == FC.QUEEN)
			fighter = new Queen();
		else if(type == FC.HYDRALISK)
			fighter = new Hydralisk();
		else if(type == FC.BANELING)
			fighter = new Baneling();
		else if(type == FC.ROACH)
			fighter = new Roach();
		else if(type == FC.INFESTOR)
			fighter = new Infestor();
		else if(type == FC.MUTALISK)
			fighter = new Mutalisk();
		else if(type == FC.CORRUPTOR)
			fighter = new Corruptor();
		else if(type == FC.ULTRALISK)
			fighter = new Ultralisk();
		else if(type == FC.BROODLORD)
			fighter = new Broodlord();
			
		return fighter;	
	}
	public int checkFighterPrice(int type)
	{
		int cost = 0;
		if(type == FC.ZERGLING)
			cost = FC.ZERGLING_COST;
		else if(type == FC.QUEEN)
			cost = FC.QUEEN_COST;
		else if(type == FC.HYDRALISK)
			cost = FC.HYDRALISK_COST;
		else if(type == FC.BANELING)
			cost = FC.BANELING_COST;
		else if(type == FC.ROACH)
			cost = FC.ROACH_COST;
		else if(type == FC.INFESTOR)
			cost = FC.INFESTOR_COST;
		else if(type == FC.MUTALISK)
			cost = FC.MUTALISK_COST;
		else if(type == FC.CORRUPTOR)
			cost = FC.CORRUPTOR_COST;
		else if(type == FC.ULTRALISK)
			cost = FC.ULTRALISK_COST;
		else if(type == FC.BROODLORD)
			cost = FC.BROODLORD_COST;

		return cost;
	}

}