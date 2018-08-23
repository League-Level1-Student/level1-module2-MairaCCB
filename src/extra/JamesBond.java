package extra;

public class JamesBond {
	public int getCode(Vault v) {

		for(int a = 1; a<1000000; a++) {
			if(v.guessCode(a)) {
				return a;
			}
		}
		return -1;
	}
}
