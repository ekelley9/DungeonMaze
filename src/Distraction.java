
public class Distraction implements Abilities {

	@Override
	public void attack(HeistCharacter character, HeistCharacter enemy) {

		double surprise = Math.random();
		if (surprise <= .4) {
			System.out.println(character.getName() + "'s Distracted " + enemy.getName() + " " + character.getName()
					+ " get's another turn.");
			((Robber) character).setNumTurns(((Robber) character).getNumTurns() + 1);
			character.attack(enemy);
		} else if (surprise >= .9) {
			System.out.println(character.getName() + " was not alluring enough " + enemy.getName() + " punches you \n");
			character.subtractHitPoints(5);
		} else
			character.attack(enemy);

	}

}
