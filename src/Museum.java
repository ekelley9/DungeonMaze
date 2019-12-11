import java.util.*;
public class Museum {
	private int pillars = 0;
	
	private int playerRow = 0;
	private int playerColumn = 0;
	
	private Room[][] museum = new Room [5][5]; 
	
	private Room curRoom = museum[this.playerColumn][this.playerRow];
	
	private Random rand = new Random();
	
	public Museum(){
		for(int i = 0; i < museum.length; i++) {
			for(int j = 0; j < museum.length; j++) {
				museum[i][j] = new Room(1, 1, 1, 1);
			}
		}
		addBorders();
		museum[0][0] = new EntranceRoom();
		museum[4][4] = new ExitRoom();
		addPillars();
	}
	
	public Room getcurRoom() {
		return this.curRoom;
	}
	
	public void addPillars() {
		while(pillars < 5) {
			Room pillar = museum[rand.nextInt(5)][rand.nextInt(5)];
			if(!pillar.getContents().containsKey("Pillar"))
			{
				pillar.getContents().put("Pillar", 1);
			}
			this.pillars++;
		}
	}
	
	public void addBorders() {
		for(int i = 0; i < museum.length; i++) {
			museum[0][i] = new Room(0, 1, 1, 1);
			museum[4][i] = new Room(1, 1, 0, 0);
			museum[i][0] = new Room(1, 1, 1, 0);
			museum[i][4] = new Room(1, 0, 1, 1);			
		}
		
		museum[0][4] = new Room(0, 0, 1, 1);
		museum[4][0] = new Room(1, 1, 0, 0);
		
		
	}
	
	public void printMuseum() {
		
		for (int i = 0; i < this.museum.length; i++) {
			for (int j = 0; j < this.museum.length; j++) {
				System.out.print( this.museum[i][j].roomTop()+" ");
			}
			System.out.println();
			for (int k = 0; k < this.museum.length; k++) {
				System.out.print( this.museum[i][k].roomMid("")+" ");
			}
			System.out.println();
			for (int l = 0; l < this.museum.length; l++) {
				System.out.print( this.museum[i][l].roomBottom()+" ");
			}
			System.out.println();
			
				
		}
		
		
		
		
	}

	public void enterRoom(Robber robber) {
		
		if(museum[this.playerColumn][this.playerRow].getContents().containsKey("Waldo")){
			System.out.println(robber.getName() + " enters the room to find Waldo standing under a spotlight, Waldo snaps his fingers");
			System.out.println(robber.getName() + " slowly dissapeares into the abyss \nThe Heist was a failure");
			System.exit(0);

		}
		
		if(museum[this.playerColumn][this.playerRow].getContents().containsKey("Laser Grid")){
			System.out.println(robber.getName() + " has triggerd a laser Grid");
			robber.subtractHitPoints(20);
		}
		
		if(museum[this.playerColumn][this.playerRow].getContents().containsKey("LawMan")){
			museum[this.playerColumn][this.playerRow].getContents().get("LawMan");
		}
		
		if(museum[this.playerColumn][this.playerRow].getContents().containsKey("Med Kit")){ 
			System.out.println(robber.getName() + " found a Med Kit and added it to his inventory");
			robber.addMedKit();
			
		}
		
		if(museum[this.playerColumn][this.playerRow].getContents().containsKey("Map Fragment")){ 
			
		}
		
		if(museum[this.playerColumn][this.playerRow].getContents().containsKey("Pillar")){ 
			System.out.println("Found a pillar and added it to his inventory");
			robber.addPillars();
		}
		
		if( museum[this.playerColumn][this.playerRow] instanceof ExitRoom)
		{ 
			if(robber.maxPillars()) {
				System.out.println("Congratulations you found all the pillars Job well done");
				System.exit(0);
			}else{
				System.out.println("You Dont have all the pillars yet come back when you find them all");
			}
		}
		
		if(museum[this.playerColumn][this.playerRow].getContents().isEmpty()){
			System.out.println("This room is empty nothing to find");
			
		}
		
	}
	

	
	public void advanceEastWest(String direction) {
		Room curRoom = museum[this.playerColumn][this.playerRow];
		
		if (direction.equals("West") && curRoom.isDoor(curRoom.westWall)) {
			this.playerRow--;
			curRoom.roomMid("P");
		} else if (direction.equals("East") && curRoom.isDoor(curRoom.eastWall)) {
			this.playerRow++;
			curRoom.roomMid("P");
		} else {
			System.out.println("Cannot move this way there is no door");
		}

	}
	
	public void advanceNorthSouth(String direction) {

		Room curRoom = museum[this.playerColumn][this.playerRow];

		if (direction.equals("North") && curRoom.isDoor(curRoom.northWall)) {
			this.playerColumn--;
			curRoom.roomMid("P");
		} else if (direction.equals("South") && curRoom.isDoor(curRoom.southWall)) {
			this.playerColumn++;
			curRoom.roomMid("P");
		} else {
			System.out.println("Cannot move this way there is no door");
		}
	}
	
	
}
