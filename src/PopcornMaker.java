
public class PopcornMaker {
	public static void main(String[] args) {
			Popcorn p = new Popcorn("butter");
			Microwave m = new Microwave();
			m.putInMicrowave(p);
			m.setTime(5);
			m.startMicrowave();
		
	}
}
