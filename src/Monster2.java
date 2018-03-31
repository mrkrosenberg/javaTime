import java.util.Arrays;

// a file can only contain one public class, but can contain many classes
public class Monster2 {
	
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard() {
		
		// defines each box
		for(char[] row : battleBoard) {
			// fills each box with '*'
			Arrays.fill(row,  '*');
			
		}
	}
	
	public static void redrawBoard() {
		
		int k = 1;
		while(k <= 30) {
			System.out.print('-'); k++;
		}
		System.out.println();
		
		for(int i = 0; i < battleBoard.length; i++) {
			
			for (int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		while(k <= 30) {
			System.out.print('-'); k++;
		}
		
	}
	
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
		int intDecreaseHealth = (int) decrease;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	// constructor function - must have same name as main class
	public Monster2(int health, int attack, int movement) {
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	
	// creates an overloaded constructor
	public Monster2() {
		// blank constructors are only executed if no other constructor is defined
	}
	
}