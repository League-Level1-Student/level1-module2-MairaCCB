
public class TeaMakerRunner {
public static void main(String[] args) {
	Cup c = new Cup();
	Kettle k = new Kettle();
	TeaBag t = new TeaBag("mint");
	
	k.boil();
	
	c.makeTea(t, k.getWater());
}
}
