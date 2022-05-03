
public class GameCharacter {
	private String name;
	private int strength;
	private int defence;
	private int mp;
	private int currentHealth;
	private int maxHealth;
	private int level;
	private String role;
	private boolean alive;

	public GameCharacter(String name, int strength, int defence, int mp, int currentHealth, int maxHealth, int level,
			String role) {
		this.name = name;
		this.strength = strength;
		this.defence = defence;
		this.mp = mp;
		this.currentHealth = currentHealth;
		this.maxHealth = maxHealth;
		this.level = level;
		this.role = role;
	}
	
	public GameCharacter(String name, int maxHealth, boolean alive) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.alive = alive;
	}
	
	public boolean getAlive() {
		return alive;
	}

	
	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}

	public int getDefence() {
		return defence;
	}

	public int getMp() {
		return mp;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getLevel() {
		return level;
	}

	public String getRole() {
		return role;
	}

}
