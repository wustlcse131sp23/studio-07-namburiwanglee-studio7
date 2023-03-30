package studio7;

public class Rectangle {

	private int width;
	private int length; 
	
	public Rectangle(int width1, int length1) {
		this.width = width1;
		this.length = length1; 
	}
	
	public int getWidth() {
		return width; 
	}
	
	public int getLength() {
		return length; 
	}
	
	public int calculateArea() {
		return width * length;
	}
	
	public int calculatePerimeter() {
		return 2*(width + length);
	}

	public boolean isSquare() {
		if (width == length) 
			return true;
		else {
			return false;
		}
	}
	
	public String toString() {
		return width + " " + length;
	}
	
	public static void main(String[] args) {
		Rectangle rectangleA = new Rectangle(3,4);
		System.out.println(rectangleA.toString());
		System.out.println(rectangleA.calculateArea());
		System.out.println(rectangleA.calculatePerimeter());
		rectangleA.isSquare();
	}

}
