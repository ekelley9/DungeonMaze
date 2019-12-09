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
		for(int pillar = 0; pillar < 5; pillar++)
		{
			this.museum[rand.nextInt(5)][rand.nextInt(5)].getContents().put("Pillar", 1);
		}
	}
	
	public void printMuseum() {
		
		for (int i = 0; i < this.museum.length; i++) {
			for (int j = 0; j < this.museum.length; j++) {
				System.out.print( this.museum[i][j].toString() + " ");
			}
			System.out.println();
				
		}
		
		
		
		
	}
	
	public void printMuseum2() {
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][0].roomTop() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][0].roomMid() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][0].roomBottom() + " ");
		}
		System.out.println();
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][1].roomTop() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][1].roomMid() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][1].roomBottom() + " ");
		}
		System.out.println();
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][2].roomTop() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][2].roomMid() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][2].roomBottom() + " ");
		}
		System.out.println();
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][3].roomTop() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][3].roomMid() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][3].roomBottom() + " ");
		}
		System.out.println();
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][4].roomTop() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][4].roomMid() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][4].roomBottom() + " ");
		}
		System.out.println();
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][5].roomTop() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][5].roomMid() + " ");
		}
		for (int i = 0; i < this.museum.length; i++) {
			System.out.print(this.museum[i][5].roomBottom() + " ");
		}
		System.out.println();
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
