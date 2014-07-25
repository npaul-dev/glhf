/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class Mutalisk extends AirFighter
{
	String name;
	double health;
	double attack;
	double armor;
	int speed;
	int cost;
	
	public Mutalisk()
	{
		this.cost = FC.MUTALISK_COST;
		this.health = 100;
		this.attack = FC.MUTALISK_ATTACK;
		this.armor = FC.MUTALISK_ARMOR;
		this.speed = FC.MUTALISK_SPEED;
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
	public String toString(){return "Mutalisk";}	

	@Override 
	public boolean canAttack (Fighter target) {
        // we can only attack air targets
        return (target != null && !target.isGround());
    }

    public void attack(Fighter in)
    {
	 
	 
	     System.out.println(""+this.toString()+" attacks "+ in.toString()+" for "+this.getAttack() +" damage points!");

	 	  in.setHealth(this.attack);  
    }
}