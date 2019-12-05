import java.util.*;
public class Room 
{

//integers to keep track of n, s, e, w
	int northWall, eastWall, southWall, westWall;
	
// hashmap to keep track of Objects in the room
	private HashMap<String, Object> roomContents = new HashMap<>();
	
	public Room(int northWall, int eastWall, int southWall, int westWall) {
		this.northWall = northWall;
		this.eastWall = eastWall;
		this.southWall = southWall;
		this.westWall = westWall;
	}
	
	public HashMap getContents() {
		return roomContents;
	}
	
	
	
	@Override
	public String toString() 
	{
		return null;
	}
}
