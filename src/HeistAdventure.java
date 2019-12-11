import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class HeistAdventure {
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		Museum java;
		Robber theRobber;
		
		List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>(); 
        Originator originator = new Originator();
        //to save game state to array
        //savedStates.add(originator.saveToMemento()); 
        //to load last state saved
        //originator.restoreFromMemento(savedStates.get(0));
        
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
	
	private static boolean decision(String str) {
		while (true) {
			System.out.print(str);
			String selection = kb.nextLine().toUpperCase();
			switch (selection) {
			case "Y":
				return true;
			case "N":
				return false;
			default:
				System.out.print("Make a valid selection: ");
			}
		}
	}
	
	private static boolean isSaveGame() {
		File file = new File("savedMuseum.txt");
		if (file.exists()) {
			return true;
		}
		file.delete();
		return false;
	}
	
	public static void saveGame(Museum theMuseum, Robber theRobber) {
		if (isSaveGame() && !decision("Save over your previous save? Y/N: ")) {
			return;
		}
		try {
			ObjectOutputStream museumToSave = new ObjectOutputStream(new FileOutputStream("savedMuseum.txt"));
			ObjectOutputStream robberToSave = new ObjectOutputStream(new FileOutputStream("savedRobber.txt"));
			museumToSave.writeObject(theMuseum);
			robberToSave.writeObject(theRobber);
			museumToSave.close();
			robberToSave.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Game saved.");
	}
	
	public static Museum loadMuseum() {
		try {
			ObjectInputStream museumToLoad = new ObjectInputStream(new FileInputStream("savedMuseum.txt"));
			Museum museum = (Museum) museumToLoad.readObject();
			museumToLoad.close();
			return museum;
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Robber loadRobber() {
		try {
			ObjectInputStream robberToLoad = new ObjectInputStream(new FileInputStream("savedRobber.txt"));
			Robber robber = (Robber) robberToLoad.readObject();
			robberToLoad.close();
			return robber;
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
