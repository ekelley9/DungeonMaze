import java.util.List;
import java.util.ArrayList;

public final class Originator {
	
	private Museum museum;
	private Room curRoom;
    private Robber robber;
     
    public void set(Museum museum, Room curRoom, Robber robber) {
        this.museum = museum;
        this.curRoom = curRoom;
        this.robber = robber;
    }
    
    public Memento saveToMemento() {
    	System.out.println("Game state saved.");
        return new Memento(this.museum, this.curRoom, this.robber);
    }
 
    public void restoreFromMemento(Memento memento) {
        this.museum = memento.getSavedMuseum();
        this.curRoom = memento.getSavedCurRoom();
        this.robber = memento.getSavedRobber();
        System.out.println("Game state restored.");
    }
 
    public static class Memento {
        private final Museum museum;
        private final Room curRoom;
        private final Robber robber;

        public Memento(Museum museumToSave, Room curRoomToSave, Robber robberToSave) {
            museum = museumToSave;
            curRoom = curRoomToSave;
            robber = robberToSave;
        }
        
        private Museum getSavedMuseum() {
        	return museum;
        }
 
        private Room getSavedCurRoom() {
        	return curRoom;
        }
        
        private Robber getSavedRobber() {
        	return robber;
        }
    }
}