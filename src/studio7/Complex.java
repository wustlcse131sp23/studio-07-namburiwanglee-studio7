package studio7;

public class Complex {

	private double a;
	private double b; 
	
	public Complex(int a1, int b1) {
		this.a = a1;
		this.b = b1; 
	}
	
	public double geta() {
		return a; 
	}
	
	public double getb() {
		return b; 
		
	}
	public Complex add(Complex y) {
		double a = a +y.a;
		double b = b +y.b;
		Complex m = new Complex(a,b);
		return m;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
