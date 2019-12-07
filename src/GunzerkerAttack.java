
import java.util.*;

public class GunzerkerAttack implements Abilities {

	@Override
	public void attack(HeistCharacter character, HeistCharacter enemy) {
		Random rand = new Random(System.currentTimeMillis());
		int chanceToHit = 40;

		if (rand.nextInt(100) + 1 <= chanceToHit) {
			int damage = rand.nextInt(50) + 101;
			System.out.println(
					character.getName() + " fires wildly at " + enemy.getName() + " for " + damage + " damage!");
			enemy.subtractHitPoints(damage);
		} else {
			System.out.println(
					character.getName() + " fires blindly and too erratically failing to hit " + enemy.getName());
			System.out.println();
		}
	}

}
