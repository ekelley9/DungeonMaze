import java.util.*;
public class Museum {
	private int pillars = 0;
	
	private int playerRow = 0;
	private int playerColumn = 0;
	
	private Room[][] museum = new Room [5][5]; 
	
	private Random rand = new Random(System.currentTimeMillis());
	
	public Museum(){
		for(int i = 0; i < museum.length; i++) {
			for(int j = 0; j < museum.length; j++) {
				museum[i][j] = new Room(rand.nextInt(2), rand.nextInt(2), rand.nextInt(2), rand.nextInt(2));
			}
		}
		museum[0][0] = new EntranceRoom();
		museum[4][4] = new ExitRoom();
	}
	
	public void printMuseum() {
		
		for (int i = 0; i < this.museum.length; i++) {
			for (int j = 0; j < this.museum.length; j++) {
				System.out.print( this.museum[i][j].toString() + " ");
				for (int k = j+1; k < this.museum.length; j++) {
					System.out.print( this.museum[i][k].toString());
				}
			}
				
		}
		
		
		
		
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
