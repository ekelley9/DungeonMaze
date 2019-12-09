
public class Item {
	
	private String type;
	private String description;
	
	public Item(String type, String description) {
		this.type = type;
		this.description = description;
	}
	
	public void useMedKit(Robber robber, Item item) {
		if(item.type.equals("medKit")) {
			robber.addHitPoints(50);
			System.out.println("You use a med kit and gain 50 health");
		}
	}
	
	public void useMapFragment(Robber robber, Item item, int currentPos, String museum) {
		if(item.type.equals("mapFragment")) {
			
			System.out.println("You glance at a map fragment to see the rooms around you and then destroy it.");
		}
	}
	
	public Item medKit() {
        return new Item ("medKit", "Adds 50hp");
    }
	
	public Item mapFragment() {
		return new Item ("mapFragment", "Shows contents of adjacent rooms");
	}
	
}
