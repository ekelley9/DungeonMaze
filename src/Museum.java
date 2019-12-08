
public class Museum {
	private int pillars = 0;
	
	private int playerRow = 0;
	private int playerColumn = 0;
	
	private Room[][] museum; 
	
	public Museum(){
		for(int i = 0; i <museum.length; i++) {
			for(int j = 0; j < museum.length; j++) {
				museum[i][j] = RoomFactory.roomFactory();
			}
		}
		museum[0][0] = new EntranceRoom();
		museum[5][5] = new ExitRoom();
	}
	
	public void advanceEastWest(String direction)
	{
		if(direction.equals("West")) {
			this.playerRow--;
		}else if(direction.equals("East")) {
			this.playerRow++;
		}
		
	}
	
	public void advancesNorthSouth(String direction) {
		
		if(direction.equals("North")) {
			this.playerColumn++;
		}else if(direction.equals("South")) {
			this.playerColumn--;
		}
	}
	
	
}
