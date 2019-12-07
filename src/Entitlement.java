import java.util.Random;

public class Entitlement implements Abilities {

	@Override
	public void attack(HeistCharacter character, HeistCharacter enemy) {
		Random rand = new Random(System.currentTimeMillis());
		int chanceToHit = 100;

		if (rand.nextInt(100) + 1 <= chanceToHit) {
			int damage = rand.nextInt(999) + 999;
			System.out.println(character.getName() + " tells " + enemy.getName()
					+ " to pull up their bootstraps and gives them the student loan debt dealing " + damage
					+ " damage!");
			enemy.subtractHitPoints(damage);
		} else {
			System.out.println(character.getName()
					+ " never misses their abilities and if you are reading this then get better at coding.");
			System.out.println();
		}
	}

}