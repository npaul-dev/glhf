/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class Corruptor extends AirFighter implements Attack
{
	String name;
	double health;
	double attack;
	double armor;
	int speed;
	int cost;
	
	public Corruptor()
	{
		this.cost = FC.CORRUPTOR_COST;
		this.health = 100;
		this.attack = FC.CORRUPTOR_ATTACK;
		this.armor = FC.CORRUPTOR_ARMOR;
		this.speed = FC.CORRUPTOR_SPEED;
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
	public String toString(){return "Corruptor";}	

	@Override 
	public boolean canAttack (Fighter target) {
        // we can only attack air targets
        return (target != null && !target.isGround());
    }
	 
    public void attack(Fighter in)
    {
        if(in.isGround)
        {
            in.setHealth(0);
            System.out.println("Your fighter can't attack Ground units!");
		  }       
        else
        {
            System.out.println(""+this.toString()+" attacks "+ in.toString()+" for "+this.getAttack() +" damage points!");

            in.setHealth(this.attack);
        }  
    }
}