
public class GuardDog extends LawMan {

	public GuardDog(Abilities specialMove) {
		super("Max the guard dog", 90, 7, 85, 35, 45, 75, 30, 60, specialMove);
	}

	public void attack(HeistCharacter opponent) {
		System.out.println(getName() + " jumps at " + opponent.getName());
		super.attack(opponent);
	}

	public void heal() {
		System.out.println(this.getName() + " licks his wounds: ");
		super.heal();
	}
}
