import java.util.Random;

public class Bite implements Abilities {

	@Override
	public void attack(HeistCharacter character, HeistCharacter enemy) {
		Random rand = new Random(System.currentTimeMillis());
		int chanceToHit = 45;

		if (rand.nextInt(100) + 1 <= chanceToHit) {
			int damage = rand.nextInt(55) + 55;
			System.out.println(
					character.getName() + " lunges and bites at " + enemy.getName() + " dealing" + damage + " damage!");
			enemy.subtractHitPoints(damage);
		} else {
			System.out.println(character.getName() + " lunges and misses his bite.");
		}
	}

}