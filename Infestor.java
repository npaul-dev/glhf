/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class Infestor extends GroundFighter
{
	String name;
	double health;
	double attack;
	double armor;
	int speed;
	int cost;
	
	public Infestor()
	{
		this.cost = FC.INFESTOR_COST;
		this.health = 100;
		this.attack = FC.INFESTOR_ATTACK;
		this.armor = FC.INFESTOR_ARMOR;
		this.speed = FC.INFESTOR_SPEED;
	}

	public int hitPoints()
	{
	
		return 0;
	}	
	
	public void setHealth(double damage){this.health -= damage;}
	
	public int getCost(){return this.cost;}
	public int getSpeed(){return this.speed;}
	public double getArmor(){return this.armor;}
	public double getHealth(){return this.health;}
	public double getAttack(){return this.attack;}
	public String toString(){return "Infestor";}	

	@Override 
	public boolean canAttack (Fighter target) {
        // we can only attack ground and air targets
        return (target != null && (!target.isGround() || target.isGround()));
    }
	 
    public void attack(Fighter in)
    {
	 
	     System.out.println(""+this.toString()+" attacks "+ in.toString()+" for "+this.getAttack() +" damage points!");

	 	  in.setHealth(this.attack);  
    }
}