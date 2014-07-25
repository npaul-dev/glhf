public class HealthUpgrade extends Upgrade
{
	private int cost;
	private double upgradeAmount;
	Fighter fighter;
	
	public HealthUpgrade()
	{
		this.cost = FC.HEALTH_UPGRADE_COST;
		this.upgradeAmount = FC.HEALTH_UPGRADE_AMOUNT;
	
	}
	
	
	public double getUpgradeAmount(){return this.upgradeAmount;}
	public int getCost(){return this.cost;}
	public double getHealth(){return this.fighter.health + this.upgradeAmount;}
	public double getAttack(){return this.fighter.attack;}
	public double getArmor(){return this.fighter.armor;}

/*
	@Override
	public boolean canAttack(Fighter target) {
		// TODO Auto-generated method stub
		return false;
	}
*/
}