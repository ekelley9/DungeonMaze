import java.util.*;
public class AbilitiesPool {

	// We made these static so we could call them in our factories correctly
	private static HashMap<String, Abilities> attacks = new HashMap<>();
	private static Abilities attack;
	public static Abilities abililtyFactory(String character)
	{
		if(attacks.containsKey(character)){
			attack = attacks.get(character);
		}else
		{
			if(character.equals("Gunslinger"))
			{
				attack = attacks.put(character, new GunzerkerAttack());
			}
			
			if(character.equals("FemmeFatale")) //changed from FemFatale to FemmeFatale
			{
				attack = attacks.put(character, new Distraction());
			}
			
			if(character.contentEquals("Medic")) {
				attack = attacks.put(character, new HealthGrenade());
			}
		}
		
		
		return attack;
	}
}
