
public class BasicAttack implements Abilities{

	@Override
	public void attack(HeistCharacter character, HeistCharacter enemy) {
		boolean canAttack;
		int damage;

		canAttack = Math.random() <= character.getChanceToHit();

		if (canAttack){
			damage = (int)(Math.random() * (character.getDamageMax() - character.getDamageMin() + 1))
						+ character.getDamageMin() ;
			enemy.subtractHitPoints(damage);



			System.out.println();
		}
		else{

			System.out.println(character.getName() + "'s attack on " + enemy.getName() +
								" failed!");
			System.out.println();
		}
		
	}

}
