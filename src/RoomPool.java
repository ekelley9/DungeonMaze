import java.util.*;
public class RoomPool {
	
	public static void contentFactory(Room room) {
		Random rand = new Random(System.currentTimeMillis());
		if(rand.nextInt(100)+1 <= 40)
		{
			room.getContents().put("LawMan", LawManFactory.lawFactory(rand.nextInt(5)+1));
		}else if(rand.nextInt(100)+41 <= 60) {
			room.getContents().put("Laser Grid", 1);
		}else if(rand.nextInt(100)+61 <= 80) {
			room.getContents().put("Med Kit", 1);
		}else if(rand.nextInt(100)+81 <= 95) {
			room.getContents().put("Map Fragment", 1);
		}else if(rand.nextInt(100)+100 <=100) {
			room.getContents().put("Waldo", 1);
		}
		
	}
	
}
