import java.util.*;
public class AbilitiesPool {

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
			
			if(character.equals("FemFatale"))
			{
				attack = attacks.put(character, new GunzerkerAttack());
			}
		}
		
		
		return attack;
	}
}
