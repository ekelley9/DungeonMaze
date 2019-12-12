import java.io.Serializable;

public class Distraction implements Abilities, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7409697262917242099L;

	@Override
	public void attack(HeistCharacter character, HeistCharacter enemy) {
		
		double surprise = Math.random();
		if (surprise <= .4)
		{
			System.out.println(character.getName() + "'s Distracted " + enemy.getName()+ " " +
								character.getName() + " get's another turn.");
			((Robber) character).setNumTurns(((Robber) character).getNumTurns() + 1);
			character.attack(enemy);
		}
		else if (surprise >= .9)
		{
			System.out.println(character.getName() + " was not alluring enough " + enemy.getName() + " punches you \n");
			character.subtractHitPoints(5);
		}
		else
		    character.attack(enemy);
		
	}

}
