public class AttackUpgrade extends Upgrade
{
	private int cost;
	private double upgradeAmount;
	Fighter fighter;
	
	public AttackUpgrade()
	{
		this.cost = FC.ATTACK_UPGRADE_COST;
		this.upgradeAmount = FC.ATTACK_UPGRADE_AMOUNT;
	
	}
	
	
	public double getUpgradeAmount(){return this.upgradeAmount;}
	public int getCost(){return this.cost;}
	public double getHealth(){return this.fighter.health;}
	public double getAttack(){return this.fighter.attack + this.upgradeAmount;}
	public double getArmor(){return this.fighter.armor;}

/*
	@Override
	public boolean canAttack(Fighter target) {
		// TODO Auto-generated method stub
		return false;
	}
*/


}