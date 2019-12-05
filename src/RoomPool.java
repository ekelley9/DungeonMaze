import java.util.*;
public class RoomPool {

	public void contentFactory(Room room, String objectToAdd) {
		HashMap<String, Object> contents = room.getContents();
		if(contents.containsKey(objectToAdd)) {
			contents.get(objectToAdd);
		}else {
			if(objectToAdd.equals("DonutSLinger")) {
				contents.put(objectToAdd, new );
			}
		}
	}
}
