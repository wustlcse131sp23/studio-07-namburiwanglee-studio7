package studio7;

public class Die {
	
	
	private int n;
	
	
	public Die(int n1) {
		this.n = n1;
	}
	
	public int getn() {
		return n; 
	}
	
	public int number() {
		return (int) (Math.random()*(n)+1); 
	}

	public static void main(String[] args) {
	
		Die randomnumber = new Die(7);
		System.out.println(randomnumber.number());
	
	}

}
