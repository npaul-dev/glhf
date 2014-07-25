/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class Baneling extends GroundFighter
{
	String name;
	double health;
	double attack;
	double armor;
	int speed;
	int cost;
	
	public Baneling()
	{
		this.cost = FC.BANELING_COST;
		this.health = 100;
		this.attack = FC.BANELING_ATTACK;
		this.armor = FC.BANELING_ARMOR;
		this.speed = FC.BANELING_SPEED;
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
	public String toString(){return "Baneling";}	

	@Override 
	public boolean canAttack (Fighter target) {
        // we can only attack ground targets
        return (target != null && target.isGround());
    }

    public void attack(Fighter in)
    {
        if(!in.isGround)
        {
            in.setHealth(0);
            System.out.println("Your fighter can't attack Air units!");
		  }       
        else
        {
            System.out.println(""+this.toString()+" attacks "+ in.toString()+" for "+this.getAttack() +" damage points!");
     
            in.setHealth(this.attack);
        }  
    }

}