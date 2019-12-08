import java.util.*;
public class RoomFactory {

	private static Room theRoom;
	
	public static Room roomFactory() {
		Random rand = new Random(System.currentTimeMillis());
		theRoom = new Room(rand.nextInt(2)+1, rand.nextInt(2)+1, rand.nextInt(2)+1, rand.nextInt(2)+1);
		RoomPool.contentFactory(theRoom);
		return theRoom;
	}
}
