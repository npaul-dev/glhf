public class ArmorUpgrade extends Upgrade
{
	private int cost;
	private double upgradeAmount;
	Fighter fighter;
	
	public ArmorUpgrade()
	{
		this.cost = FC.ARMOR_UPGRADE_COST;
		this.upgradeAmount = FC.ARMOR_UPGRADE_AMOUNT;
	
	}
	
	
	public double getUpgradeAmount(){return this.upgradeAmount;}
	public int getCost(){return this.cost;}
	public double getHealth(){return this.fighter.health;}
	public double getAttack(){return this.fighter.attack;}
	public double getArmor(){return this.fighter.armor + this.upgradeAmount;}


/*
	@Override
	public boolean canAttack(Fighter target) {
		// TODO Auto-generated method stub
		return false;
	}
*/
}