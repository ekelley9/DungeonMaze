import java.util.*;
public class AbilitiesPool {

	private HashMap<String, Abilities> attacks = new HashMap<>();
	private Abilities attack;
	public Abilities abililtyFactory(String character)
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
