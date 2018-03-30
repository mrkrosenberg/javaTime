// a file can only contain one public class, but can contain many classes
public class Monster {
	
	// class variables are also called fields
	// constants are declared with final
	
	public final String TOMBSTONE = "Here lies a dead monster";
	
	// best practice : create private fields(class variables), only use public fields when necessary
	// private fields are not visible outside of the class
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	// public variables are visible outside of the class
	// you should have as few as possible public fields
	public String name = "MacDawg";
	
	// Class methods 
	// accessor methods have access to private variables
	public int getAttack() {
		return attack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	// overloaded method - same name as another method but takes different arguments 
	public void setHealth(double decrease) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	// constructor function - must have same name as main class
	public Monster(int health, int attack, int movement) {
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	
	// creates an overloaded constructor
	public Monster() {
		// blank constructors are only executed if no other constructor is defined
	}
	
}





