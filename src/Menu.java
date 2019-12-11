import java.util.Scanner;

public class Menu {

	public static void mainMenu() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Museum Heist");
		System.out.println("***********************");
		System.out.println("1.) Start a new game");
		System.out.println("2.) Load a saved game");
		System.out.println("3.) Exit");
		System.out.println("***********************");
        System.out.print("Make a selection: ");
        int selection = kb.nextInt();
        
        switch (selection) {
        	case 1:
        		newGame();
        		break;
            case 2:
                loadGame();
                break;
            case 3:
                System.exit(0);
        }
        kb.close();
        
	}
	
	public static void chooseCharacter() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Robbers for hire");
		System.out.println("***********************");
		System.out.println("1.) Gunslinger");
		System.out.println("2.) Femme Fatale");
		System.out.println("3.) Medic");
		System.out.println("4.) Demolitionist");
		System.out.println("5.) Pyromaniac");
		System.out.println("***********************");
		System.out.print("Choose a character: ");
		int choice = kb.nextInt();
		
		switch (choice) {
    	case 1:
    		RobberFactory.robberFactory(1);
    		break;
        case 2:
            RobberFactory.robberFactory(2);
            break;
        case 3:
            RobberFactory.robberFactory(3);
        	break;
        case 4:
        	RobberFactory.robberFactory(4);
        	break;
        case 5:
        	RobberFactory.robberFactory(5);
        	break;
        case 1945:
        	RobberFactory.robberFactory(1945);
        	break;
    }
    kb.close();
	}

    public static void newGame() {
       
    }

    public static void loadGame() {

    }
}
