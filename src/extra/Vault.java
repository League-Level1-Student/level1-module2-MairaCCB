package extra;

import java.util.Random;

public class Vault {
	Random ran = new Random();
	int code;
	
	public Vault() {
		code = ran.nextInt(1000000);
	}
	
	public boolean guessCode(int guess) {
		if(guess == code) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
