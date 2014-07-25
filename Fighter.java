/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public abstract class Fighter implements Attack
{
	//private iTier tier; //TODO create tier units
	String name;
	double health;
	double attack;
	double armor;
	int speed;
	protected boolean isGround;
	 
	
	
//	public Fighter(String name, int health, double attack, double armor, int speed, Fighter o)
// 	{
// 		this.name = name;
// 		this.health = health;
// 		this.attack = attack;
// 		this.armor = armor;
// 		this.opponent = o;
// 		this.speed = speed;
// 	}
	
	
	public boolean isGround(){
		return this.isGround;
	}
	
	//public abstract makeFighter(int num);

	public void setHealth(double damage){this.health = this.health;}
	public int hitPoints(){return 0;}
	public int getSpeed(){return 0;}
	public abstract double getArmor();
	public int getCost(){return 0;} 
	public abstract double getHealth();
	public abstract double getAttack();
	public abstract boolean canAttack(Fighter target);

}