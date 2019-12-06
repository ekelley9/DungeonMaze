
public class Pyromaniac extends Robber {

	public Pyromaniac(String name,  Abilities specialMove) {
		super(name, 110, 3, 90, 40, 40, 20, specialMove);
	}
	
	public void attack(HeistCharacter enemy) {
		System.out.println(this.getName() + " points their flammenwerfer at " + enemy.getName());
		super.attack(enemy);
	}

}
