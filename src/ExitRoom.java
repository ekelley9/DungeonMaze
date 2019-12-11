
public class ExitRoom extends Room{

	public ExitRoom() {
		super(1, 1, 0, 0);
		this.getContents().clear();
		
	}
	
	@Override
	public String roomMid(String Object){
		return "| O *";
	}

}
