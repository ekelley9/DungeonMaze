
public class LawMan extends HeistCharacter{

	private int numTurns;
	private Abilities specialMove;
	
	
	public LawMan (String name, int hitPoints, int attackSpeed, 
	double chanceToHit, int damageMin, int damageMax, 
	double chanceToDodge, Abilities specialMove) {
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, new BasicAttack());
		this.specialMove = specialMove;
	}

	public int getNumTurns() {
		return numTurns;
	}

	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}

	public void SpecialAttack(HeistCharacter enemy) {
		this.specialMove.attack(this, enemy);
	}
	
	public void subtractHitPoints(int damage) {
		super.subtractHitPoints(damage);
	}

}

