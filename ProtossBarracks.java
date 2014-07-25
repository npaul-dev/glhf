/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class ProtossBarracks extends FighterBarracks
{

	public Fighter buildFighter(int type)
	{
		Fighter fighter = null;
	
		if(type == FC.ZEALOT)
			fighter = new Zealot();
		else if(type == FC.STALKER)
			fighter = new Stalker();
		else if(type == FC.SENTRY)
			fighter = new Sentry();
		else if(type == FC.OBSERVER)
			fighter = new Observer();
		else if(type == FC.IMMORTAL)
			fighter = new Immortal();
		else if(type == FC.COLOSSUS)
			fighter = new Colossus();
		else if(type == FC.PHOENIX)
			fighter = new Phoenix();
		else if(type == FC.VOIDRAY)
			fighter = new VoidRay();
		else if(type == FC.HIGHTEMPLAR)
			fighter = new HighTemplar();
		else if(type == FC.DARKTEMPLAR)
			fighter = new DarkTemplar();

		return fighter;	
	}
	public int checkFighterPrice(int type)
	{
		int cost =0;
		if(type == FC.ZEALOT)
			cost = FC.ZEALOT_COST;
		else if(type == FC.STALKER)
			cost = FC.STALKER_COST;
		else if(type == FC.SENTRY)
			cost = FC.SENTRY_COST;
		else if(type == FC.OBSERVER)
			cost = FC.OBSERVER_COST;
		else if(type == FC.IMMORTAL)
			cost = FC.IMMORTAL_COST;
		else if(type == FC.COLOSSUS)
			cost = FC.COLOSSUS_COST;
		else if(type == FC.PHOENIX)
			cost = FC.PHOENIX_COST;
		else if(type == FC.VOIDRAY)
			cost = FC.VOIDRAY_COST;
		else if(type == FC.HIGHTEMPLAR)
			cost = FC.HIGHTEMPLAR_COST;
		else if(type == FC.DARKTEMPLAR)
			cost = FC.DARKTEMPLAR_COST;
		
		
		return cost;
	}

}