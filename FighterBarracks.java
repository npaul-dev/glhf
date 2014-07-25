/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public abstract class FighterBarracks
{


	public Fighter buyFighter(int type)
	{
		Fighter fighter;
		
		fighter = buildFighter(type);
	
		return fighter;
	}

	protected abstract Fighter buildFighter(int type);
	protected abstract int checkFighterPrice(int type);



}