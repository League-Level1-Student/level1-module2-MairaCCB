package extra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRunner {
	@Test	
	public void Test() {
		TestRunner t = new TestRunner();
			 assertEquals(4, t.add(2, 2));

		     assertEquals("brains", t.getZombieFood());

		     assertEquals(3, t.getLargest(3,2));
		
}

	int add(int num1, int num2) {
		return (num1 + num2);
	}

	String getZombieFood() {
		return "brains";
	}

	int getLargest(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}

		else {
			return num2;
		}
	}

}
