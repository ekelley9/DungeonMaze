
public class LawManFactory {
	
	private static LawMan theLaw;
	
	public static LawMan lawFactory(int lawChoice) {
		
		if(lawChoice == 1){
			theLaw = new DonutSlinger(AbilitiesPool.abililtyFactory("Gunslinger"));
		}else if(lawChoice == 2) {
			theLaw = new guardDog(AbilitiesPool.abililtyFactory("Gunslinger"));
		}else if(lawChoice == 3) {
			theLaw = new Swat(AbilitiesPool.abililtyFactory("Gunslinger"));
		}else if(lawChoice == 4) {
			theLaw = new Archrival(AbilitiesPool.abililtyFactory("Gunslinger"));
		}else if(lawChoice == 5) {
			theLaw = new museumSecurity(AbilitiesPool.abililtyFactory("Gunslinger"));
		}
		
		return theLaw;
	}

}
