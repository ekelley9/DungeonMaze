
public class BigBoomer extends Robber {

	public BigBoomer(String name, Abilities specialMove) {
		super(name, 1000, 1, 100, 500, 999, 99, specialMove);
	}

	public void attack(HeistCharacter enemy) {
		System.out.println(this.getName() + " OK boomer'd " + enemy.getName() + "it was super effective.");
		super.attack(enemy);
	}
}