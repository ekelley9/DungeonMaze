
public class RobberFactory {
	
	private static Robber theRobber;
	
	public static Robber robberFactory(int robberChoice) {
		
		if(robberChoice == 1) {
			theRobber = new Gunslinger("Gunslinger", AbilitiesPool.abililtyFactory("Gunslinger"));
		}else if(robberChoice == 2) {
			theRobber = new FemmeFatale("FemmeFatale", AbilitiesPool.abililtyFactory("FemmeFatale"));
		}else if(robberChoice == 3) {
			theRobber = new Medic("Medic", AbilitiesPool.abililtyFactory("Medic"));
		}else if(robberChoice == 4) {
			theRobber = new Demolitionist("Demolitionist", AbilitiesPool.abililtyFactory("Demolitionist"));
		}else if(robberChoice == 5) {
			theRobber = new Pyromaniac("Pyromaniac", AbilitiesPool.abililtyFactory("Pyromaniac"));
		}else if(robberChoice == 1945) {
			theRobber = new BigBoomer("BigBoomer", AbilitiesPool.abililtyFactory("BigBoomer"));
		}
		return theRobber;
	}

}
