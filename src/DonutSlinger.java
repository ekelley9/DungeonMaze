
public class DonutSlinger extends LawMan {

	public DonutSlinger(Abilities specialMove) {
		super("Bob", 200, 2, 60, 10, 30, 50, 30, 50, specialMove);


    }

	public void attack(HeistCharacter opponent) {
		System.out.println(getName() + " swings his maple bar club at " + opponent.getName() + ":");
		super.attack(opponent);

	}
	
	public void heal() {
		System.out.println(this.getName() + "takes a big bite out of his donut healing for: ");
		super.heal();
	}
}
