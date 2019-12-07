
public class Swat extends LawMan{

	public Swat(Abilities specialMove) {
		super("Chad", 150, 2, 60, 15, 30, 55, 30, 50, specialMove);


    }

	public void attack(HeistCharacter opponent) {
		System.out.println(getName() + " bashes his shield at " + opponent.getName() + ":");
		super.attack(opponent);

	}
	
	public void heal() {
		System.out.println(this.getName() + " uses a trauma kit healing for: ");
		super.heal();
	}
}
