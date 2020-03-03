package _02_sea_creature;

public class SeaMonster {

	public static void main(String[] args) {
		
		
		
		SeaCreature Spongebob = new SeaCreature( "Spongebob");
		
		Spongebob.eat();
		Spongebob.laugh();
		
		
		
		SeaCreature Patrick = new SeaCreature("Patrick");
		
		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();
	
	
		SeaCreature Squidward = new SeaCreature("SquidWard");
		Squidward.getName();
		Squidward.laugh();
		Squidward.eat();
	}
	
	
	
	
}
