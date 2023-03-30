package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int a, int b) {
		this.numerator = a;
		this.denominator = b;
	}
	
	public int getNumerator() {
		return numerator; 
	}
	
	public int getDenominator() {
		return denominator; 
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public Fraction addF(Fraction y) {
		int a = numerator*y.denominator + denominator*y.numerator;
		int b = denominator*y.denominator;
		Fraction m = new Fraction(a,b);
		return m;
	}
	
	public Fraction multiplyF(Fraction y) {
		int a = numerator*y.numerator;
		int b = denominator*y.denominator;
		Fraction m = new Fraction(a,b);
		return m;
	}
	
	public Fraction reciprocalF() {
		Fraction m = new Fraction(denominator, numerator);
		return m;
	}
	
	public int gcd(int p, int q) {

	if (q == 0){
		return p;
	}
	else
	{
		return gcd(q,p%q);
	}
	
	}
	
	public Fraction simplifyF() {
		int a = gcd(denominator, numerator);
		int x = denominator/a;
		int y = numerator/a;
		Fraction m = new Fraction(y,x);
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction X = new Fraction(3,7);
		System.out.println(X.toString());
		Fraction Y = new Fraction(5,9);
		System.out.println(X.addF(Y));
		System.out.println(X.multiplyF(Y));
		System.out.println(X.reciprocalF());
		System.out.println((X.multiplyF(Y)).simplifyF());
	}

}
