package extra;

public class VaultRunner {
public static void main(String[] args) {
	Vault v = new Vault();
	JamesBond j = new JamesBond();
	
	System.out.println(j.getCode(v));
}
}
