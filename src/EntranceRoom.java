
public class EntranceRoom extends Room{

	public EntranceRoom() {
		super(0, 1, 1, 0);
	}
	
	@Override
	public String roomMid(String Object){
		return "* I |";
	}

}
