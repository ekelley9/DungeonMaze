package dungeon;
import java.util.*;
public class RoomPool {
	
	public static HashMap contentFactory() {
		Random rand = new Random(System.currentTimeMillis());
		HashMap<String, Object> contents = new HashMap();
		if(rand.nextFloat() <= .40f)
		{
			contents.put("LawMan", LawManFactory.lawFactory(rand.nextInt(5)+1));
		}else if(rand.nextFloat() <= .60f) {
			contents.put("Laser Grid", 1);
		}else if(rand.nextFloat() <= .5) {
			contents.put("Med Kit", 1);
		}else if(rand.nextFloat() <= .15f) {
			contents.put("Map Fragment", 1);
		}else if(rand.nextInt() <= .1f) {
			contents.put("Waldo", 1);
		}
		return contents;
	}
	
}
