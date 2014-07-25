public class ZergFighterData extends FighterData
{





	
	public void getFighters()
	{
		System.out.printf("%n    %-11s %5s %5s %5s %5s  %-7s %-9s%n",  "NAME","SPEED","ARMOR","ATTACK", "COST", "TYPE", "ATTACKS");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 1, "Zergling",FC.ZERGLING_SPEED,FC.ZERGLING_ARMOR, FC.ZERGLING_ATTACK,FC.ZERGLING_COST,"Ground", "Ground");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 2, "Queen",FC.QUEEN_SPEED,FC.QUEEN_ARMOR, FC.QUEEN_ATTACK, FC.QUEEN_COST,"Ground", "Air/Ground");
    System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 3, "Hydralisk",FC.HYDRALISK_SPEED,FC.HYDRALISK_ARMOR, FC.HYDRALISK_ATTACK, FC.HYDRALISK_COST,"Ground","Air/Ground");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 4, "Baneling",FC.BANELING_SPEED,FC.BANELING_ARMOR, FC.BANELING_ATTACK,FC.BANELING_COST,"Ground", "Ground");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 5, "Roach",FC.ROACH_SPEED,FC.ROACH_ARMOR, FC.ROACH_ATTACK,FC.ROACH_COST,"Ground","Ground");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 6, "Infestor",FC.INFESTOR_SPEED,FC.INFESTOR_ARMOR, FC.INFESTOR_ATTACK,FC.INFESTOR_COST,"Ground", "Air/Ground");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 7, "Mutalisk",FC.MUTALISK_SPEED,FC.MUTALISK_ARMOR, FC.MUTALISK_ATTACK,FC.MUTALISK_COST,"Air", "Air/Ground");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 8, "Corruptor",FC.CORRUPTOR_SPEED,FC.CORRUPTOR_ARMOR, FC.CORRUPTOR_ATTACK,FC.CORRUPTOR_COST,"Air", "Air");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 9, "Ultralisk",FC.ULTRALISK_SPEED,FC.ULTRALISK_ARMOR, FC.ULTRALISK_ATTACK,FC.ULTRALISK_COST,"Ground", "Ground");
		System.out.printf("%2d: %-11s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 10, "Brood Lord",FC.BROODLORD_SPEED,FC.BROODLORD_ARMOR, FC.BROODLORD_ATTACK,FC.BROODLORD_COST,"Air", "Ground");
	}

}