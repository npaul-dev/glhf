public class TerranFighterData extends FighterData
{





	public void getFighters()
	{
        System.out.printf("%n    %-14s %5s %5s %5s %5s  %-7s %-9s%n",  "NAME","SPEED","ARMOR","ATTACK", "COST", "TYPE", "ATTACKS");		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 1, "Marine",FC.MARINE_SPEED,FC.MARINE_ARMOR, FC.MARINE_ATTACK,FC.MARINE_COST,"Grount", "Air/Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 2, "Marauder",FC.MARAUDER_SPEED,FC.MARAUDER_ARMOR, FC.MARAUDER_ATTACK, FC.MARAUDER_COST,"Ground", "Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 3, "Reaper",FC.REAPER_SPEED,FC.REAPER_ARMOR, FC.REAPER_ATTACK, FC.REAPER_COST,"Ground", "Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 4, "Hellion",FC.HELLION_SPEED,FC.HELLION_ARMOR, FC.HELLION_ATTACK,FC.HELLION_COST,"Ground", "Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 5, "Siege Tank",FC.SIEGETANK_SPEED,FC.SIEGETANK_ARMOR, FC.SIEGETANK_ATTACK,FC.SIEGETANK_COST,"Ground", "Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 6, "Thor",FC.THOR_SPEED,FC.THOR_ARMOR, FC.THOR_ATTACK,FC.THOR_COST,"Ground", "Air/Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 7, "Viking",FC.VIKING_SPEED,FC.VIKING_ARMOR, FC.VIKING_ATTACK,FC.VIKING_COST,"Air", "Air/Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 8, "Raven",FC.RAVEN_SPEED,FC.RAVEN_ARMOR, FC.RAVEN_ATTACK,FC.RAVEN_COST,"Air", "Air/Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 9, "Battle Cruiser",FC.BATTLECRUISER_SPEED,FC.BATTLECRUISER_ARMOR, FC.BATTLECRUISER_ATTACK,FC.BATTLECRUISER_COST,"Air", "Air/Ground");
		System.out.printf("%2d: %-14s %5d %5.1f %5.1f %5d   %-7s %-9s%n", 10, "Banshee",FC.BANSHEE_SPEED,FC.BANSHEE_ARMOR, FC.BANSHEE_ATTACK,FC.BANSHEE_COST,"Air", "Ground");
	}
}