
public class HeistCharacter {

	private String name;
	private int hitPoints;
	private int attackSpeed;
	private double chanceToHit;
	private int damageMin, damageMax;
	private Abilities basicAttack;

	public HeistCharacter(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax,
			Abilities basicAttack) {

		this.name = name;
		this.hitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;
		this.basicAttack = basicAttack;

	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public int getDamageMin() {
		return this.damageMin;
	}

	public int getDamageMax() {
		return this.damageMax;
	}

	public double getChanceToHit() {
		return this.chanceToHit;
	}

	public void addHitPoints(int hitPoints) {
		if (hitPoints <= 0)
			System.out.println("Health amount must be positive.");
		else {
			this.hitPoints += hitPoints;

		}
	}

	public void subtractHitPoints(int damage) {
		if (hitPoints < 0)
			System.out.println("Health amount must be positive.");
		else if (hitPoints > 0) {
			this.hitPoints -= damage;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(getName() + " was hit" + " for " + damage + " damage.");
			System.out.println(getName() + " now has " + getHitPoints() + " health remaining.");
			System.out.println();
		}

		if (this.hitPoints == 0)
			System.out.println(name + " has been arrested ");

	}

	public boolean isAlive() {
		return (hitPoints > 0);
	}

	public void attack(HeistCharacter enemy) {
		basicAttack.attack(this, enemy);

	}

}
