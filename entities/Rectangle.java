package entities;

public class Rectangle {
	public double alt;
	public double larg;

	public double area() {
		return alt * larg;
	}

	public double perimetro() {
		return 2 * alt + larg;
	}

	public double diagonal() {
		return Math.sqrt(alt * larg + larg * alt);
	}

	public String toString() {
		return "A area: " 
	    + String.format("%.2f", area()) 
	    +", Perimetro:"
	    + String.format("%.2f", perimetro())
	    +", diagonal:"
	    + String.format("%.2f", diagonal());
	}
}
