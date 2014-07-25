public class ProtossFighterData extends FighterData
{



	public void getFighters()
	{
		System.out.printf("%n    %-12s %5s %5s %5s %5s  %-7s %-9s%n",  "NAME","SPEED","ARMOR","ATTACK", "COST", "TYPE", "ATTACKS");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 1, "Zealot",FC.ZEALOT_SPEED,FC.ZEALOT_ARMOR, FC.ZEALOT_ATTACK,FC.ZEALOT_COST,"Ground", "Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 2, "Stalker",FC.STALKER_SPEED,FC.STALKER_ARMOR, FC.STALKER_ATTACK, FC.STALKER_COST,"Ground", "Air/Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 3, "Sentry",FC.SENTRY_SPEED,FC.SENTRY_ARMOR, FC.SENTRY_ATTACK, FC.SENTRY_COST,"Ground", "Air/Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 4, "Observer",FC.OBSERVER_SPEED,FC.OBSERVER_ARMOR, FC.OBSERVER_ATTACK,FC.OBSERVER_COST,"Ground", "Air/Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 5, "Immortal",FC.IMMORTAL_SPEED,FC.IMMORTAL_ARMOR, FC.IMMORTAL_ATTACK,FC.IMMORTAL_COST,"Ground", "Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 6, "Colossus",FC.COLOSSUS_SPEED,FC.COLOSSUS_ARMOR, FC.COLOSSUS_ATTACK,FC.COLOSSUS_COST,"Ground", "Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 7, "Phoenix",FC.PHOENIX_SPEED,FC.PHOENIX_ARMOR, FC.PHOENIX_ATTACK,FC.PHOENIX_COST,"Air", "Air");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 8, "Void Ray",FC.VOIDRAY_SPEED,FC.VOIDRAY_ARMOR, FC.VOIDRAY_ATTACK,FC.VOIDRAY_COST,"Air", "Air/Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 9, "High Templar",FC.HIGHTEMPLAR_SPEED,FC.HIGHTEMPLAR_ARMOR, FC.HIGHTEMPLAR_ATTACK,FC.HIGHTEMPLAR_COST,"Ground", "Air/Ground");
		System.out.printf("%2d: %-12s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 10, "Dark Templar",FC.DARKTEMPLAR_SPEED,FC.DARKTEMPLAR_ARMOR, FC.DARKTEMPLAR_ATTACK,FC.DARKTEMPLAR_COST,"Ground", "Ground");
	
	}


}