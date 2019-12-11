import java.util.*;
public class HeistAdventure {
	private Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		Museum java;
		Robber theRobber;

	}
	
	public void menu() {
		
		do {
			
		}while(playAgain());
	}
	
	public Museum startGame() {
		System.out.print("Would you like to start the Heist? y/n: ");
		if(kb.nextLine().toUpperCase() == "Y") {
			return new Museum();
		}
		return null;
	}

	public boolean playAgain() {
		String choice = "";
		while(true){
			System.out.print("Would you like to perform the next heist y/n: ");
			choice = kb.nextLine().toUpperCase();
			switch(choice) {
			case "Y":
				return true;
			case "N":
				return false;
			default:
				System.out.println("Please enter a valid selection");
			
			}
			
		}
	}
}
