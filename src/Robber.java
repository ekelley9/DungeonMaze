import java.util.*;
public class Robber extends HeistCharacter{
	
	private double chanceToDodge;
	private int numTurns;
	private int pillarCount = 0;
	private int traumaPack = 0;
	private int logicBomb =  0;
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
	
	public int getTraumaPack() {
		return traumaPack;
	}

	public void setTraumaPack(int traumaPack) {
		this.traumaPack = traumaPack;
	}

	public int getLogicBomb() {
		return logicBomb;
	}

	public void setLogicBomb(int logicBomb) {
		this.logicBomb = logicBomb;
	}

	public void addPillars(){
		this.pillarCount++;
	}
	
	public boolean maxPillars(){
		return this.pillarCount == 4;
	}
	
	public boolean dodge() {
		Random rand = new Random(System.currentTimeMillis());
		int dodge = rand.nextInt(100)+1;
		return this.chanceToDodge <= dodge;
	}
	
	public void SpecialAttack(HeistCharacter enemy) {
		specialMove.attack(this, enemy);
	}
	
	public void subtractHitPoints(int damage) {
		
		if(dodge()) {
			System.out.println(this.getName() + "managed to dodge the attack");
		}else {
			super.subtractHitPoints(damage);
		}
	}

}
