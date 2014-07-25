import java.util.*;
/*

		PRESTIGE WORLDWIDE

		Devin Wright Justin Griffin Anthony Samaha Nathan Paul


*/
public class Commander
{
	private String name;
	private ArrayList<Fighter> fighters;
	private int money;
	private FighterData race;
	private FighterBarracks barracks;
	private Fighter curFighter;
	private FighterArmory armory;
	//private ArrayList<Upgrade> upgrades;
	
	public Commander()
	{
		this.name = "";
		this.money = 0;
		this.fighters = new ArrayList<Fighter>();
		this.armory = new FighterArmory();
		//this.upgrades = new ArrayList<Upgrade>();
	
	}
	public void setArmory(FighterArmory armoryPI){this.armory = armoryPI;}
	public void setCurFighter(Fighter fighterPI){this.curFighter = fighterPI;}
	public void setBarracks(FighterBarracks barracksPI){this.barracks = barracksPI;}
	public void setRace(FighterData racePI){this.race = racePI;}
	public void setMoney(int moneyPI){this.money = moneyPI;}
	public void setName(String namePI){this.name = namePI;}
	public void setFighters(ArrayList<Fighter> fightersPI){this.fighters = fightersPI;}
	//public void setUpgrades(ArrayList<Upgrade> upgradesPI){this.upgrades = upgradesPI;}
	public void addFighter(Fighter fighterPI){ this.fighters.add(fighterPI);}
	//public void addUpgrade(Upgrade upgradePI){this.upgrades.add(upgradePI);}

	
	public FighterArmory getFighterArmory(){return this.armory;}
	public String getName() {return this.name;}
	public int getMoney() {return this.money;}
	public ArrayList getFighters(){return this.fighters;}
	public FighterData getRace(){return this.race;}
	public FighterBarracks getBarracks(){return this.barracks;}
	public Fighter getCurFighter(){return this.curFighter;}
	public Fighter getFighterAtIndex(int index){return this.fighters.get(index);}
	//public Fighter getUpgradeAtIndex(int index){return this.upgrades.get(index);}
	public void removeCurFighter(Fighter deadFighter) {this.fighters.remove(deadFighter);}

	public int printFighters()
	{
		int i = 1;
		for(Fighter f: this.fighters)
		{
			System.out.println(i+": "+f);
		
			i++;
		}
	
		return this.fighters.size();
	}
	
	/*
	private int printUpgrades()
	{
		int i = 1;
		for(Upgrade f: this.upgrades)
		{
			System.out.println(i+": "+f);
		
			i++;
		}
	
		return this.upgrades.size();
	
	}*/

}