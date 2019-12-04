
public class Robber extends HeistCharacter{
	
	private double chanceToDodge;
	private int numTurns;
	private Abilities specialMove;
	
	public Robber (String name, int hitPoints, int attackSpeed, 
	double chanceToHit, int damageMin, int damageMax, 
	double chanceToDodge, Abilities specialMove) {
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, new BasicAttack());
		this.chanceToDodge = chanceToDodge;
		this.specialMove = specialMove;
	}

	public int getNumTurns() {
		return numTurns;
	}

	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	
	

}
