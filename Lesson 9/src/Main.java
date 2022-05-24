import org.junit.Test;

public class Main {
@Test
	public static void main(String[] args) {

// Sora
		GameCharacter goodGuy = new GameCharacter("Sora", 57, 48, 50, 72, 72, 100, "Keyblade Master");
		System.out.println("Name: " + goodGuy.getName());
		System.out.println("Strength: " + goodGuy.getStrength());
		System.out.println("Defence: " + goodGuy.getDefence());
		System.out.println("MP: " + goodGuy.getMp());
		System.out.println("Current Health: " + goodGuy.getCurrentHealth());
		System.out.println("Max Health: " + goodGuy.getMaxHealth());
		System.out.println("Level: " + goodGuy.getLevel());
		System.out.println("Role: " + goodGuy.getRole());
		System.out.println(" ");
		
// Goofy
		GameCharacter support = new GameCharacter("Goofy", 48, 60, 42, 90, 90, 100, "Captain of the Royal Knights");
		System.out.println("Name: " + support.getName());
		System.out.println("Strength: " + support.getStrength());
		System.out.println("Defence: " + support.getDefence());
		System.out.println("MP: " + support.getMp());
		System.out.println("Current Health: " + support.getCurrentHealth());
		System.out.println("Max Health: " + support.getMaxHealth());
		System.out.println("Level: " + support.getLevel());
		System.out.println("Role: " + support.getRole());
		System.out.println(" ");

// Donald
		GameCharacter magic = new GameCharacter("Donald", 34, 40, 70, 90, 50, 100, "Court Magician");
		System.out.println("Name: " + magic.getName());
		System.out.println("Strength: " + magic.getStrength());
		System.out.println("Defence: " + magic.getDefence());
		System.out.println("MP: " + magic.getMp());
		System.out.println("Current Health: " + magic.getCurrentHealth());
		System.out.println("Max Health: " + magic.getMaxHealth());
		System.out.println("Level: " + magic.getLevel());
		System.out.println("Role: " + magic.getRole());
		System.out.println(" ");
	
	
// Grunt class
	
		GameCharacter grunt = new GameCharacter("Grunt", 1 , true);
		System.out.println("Name: " + grunt.getName());
		System.out.println("Max Health: " + grunt.getMaxHealth());
		System.out.println("Alive: " + grunt.getAlive());
			
	}

public Object goodGuy;

public int goodGuy() {
	// TODO Auto-generated method stub
	return goodGuy();
}
}
