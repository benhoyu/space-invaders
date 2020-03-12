import javafx

public abstract class Mob{
	//fields
	int damage;
	int speed;
	String owner;
	Rectangle body;
	
	//constructor
	public Mob(String owner){
		this.owner = owner;
	}
	
	//getters/setters
	public int getDmg(){return damage;}
	public int getSpd(){return speed;}
	public String getOwner(){return owner;}
		
	//methods
}