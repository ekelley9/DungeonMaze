import java.util.*;

public class Room {

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

	public boolean isDoor(int wall) {
		return wall == 1;
	}

	public String roomTop() {
		String top = "";
		if (this.isDoor(northWall)) {
			top = "* - *";
		} else {
			top = "***";
		}
		return top;
	}

	public String roomMid(String object) {
		String east = "";
		String west = "";
		if (this.isDoor(this.westWall)) {
			west = "| ";
		} else {
			west = "* ";
		}

		if (this.roomContents.size() > 1) {
			object = "M";
		} else if (this.roomContents.size() < 1) {
			object = "E";
		} else if (this.roomContents.size() == 1 && this.roomContents.containsKey("LawMan")) {
			object = "X";
		} else if (this.roomContents.size() == 1 && this.roomContents.containsKey("Laser Grid")) {
			object = "L";
		} else if (this.roomContents.size() == 1 && this.roomContents.containsKey("Vision Potion")) {
			object = "V";
		} else if (this.roomContents.size() == 1 && this.roomContents.containsKey("Medic Kit")) {
			object = "H";
		}

		if (this.isDoor(this.eastWall)) {
			east = " |";
		} else {
			east = " *";
		}
		return west + object + east;
	}

	public String roomBottom() {
		String bottom = "";

		if (this.isDoor(this.southWall)) {
			bottom = "*-*";
		} else {
			bottom = "***";
		}

		return bottom;
	}

	@Override
	public String toString() {

		return this.roomTop() + "\n" + this.roomMid(null) + "\n" + this.roomBottom();
	}
}
