public class FighterArmory
{

	public Upgrade buyUpgrade(int type)
	{
		Upgrade item = null;
		
		if(type == FC.HEALTH_UPGRADE)
			item = new HealthUpgrade();
		else if(type == FC.ARMOR_UPGRADE)
			item = new ArmorUpgrade();
		else if(type == FC.ATTACK_UPGRADE)
			item = new AttackUpgrade();
					
		return item;
	}
	
	public void getUpgrades()
	{
			System.out.printf("1: %-15s  100%n","Armor upgrade");
			System.out.printf("2: %-15s   50%n","Health upgrade");
			System.out.printf("3: %-15s  100%n","Attack upgrade");
	}
	public int checkUpgradePrice(int type)
	{
		int cost = 0; 
		
		if(type == FC.HEALTH_UPGRADE)
			cost = FC.HEALTH_UPGRADE_COST;
		else if(type == FC.ARMOR_UPGRADE)
			cost = FC.ARMOR_UPGRADE_COST;
		else if(type == FC.ATTACK_UPGRADE)
			cost = FC.ATTACK_UPGRADE_COST;
	
		return cost;
	
	}
}