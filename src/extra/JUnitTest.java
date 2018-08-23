package extra;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
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

