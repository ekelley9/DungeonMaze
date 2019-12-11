import java.util.List;
import java.util.ArrayList;

public final class Memory {
	
	private Museum museum;
	private Room curRoom;
    private Robber robber;
     
    public void Memory(Museum museum, Room curRoom, Robber robber) {
        this.museum = museum;
        this.curRoom = curRoom;
        this.robber = robber;
    }
    
    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.museum, this.curRoom, this.robber);
    }
 
    public void restoreFromMemento(Memento memento) {
        this.museum = memento.getSavedMuseum();
        this.curRoom = memento.getSavedCurRoom();
        this.robber = memento.getSavedRobber();
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

