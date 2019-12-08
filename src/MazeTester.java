import java.util.Random;

public class MazeTester {

	public static void main(String[]args) {
		Random rand = new Random(System.currentTimeMillis());
		Museum maze = new Museum();
		maze.printMuseum();
		Room t = new Room(rand.nextInt(2), rand.nextInt(2), rand.nextInt(2), rand.nextInt(2));
		Room v = new Room(rand.nextInt(2), rand.nextInt(2), rand.nextInt(2), rand.nextInt(2));
		//System.out.println(v.toString());
		//System.out.println(t.toString());
		
	}
}
