class Complex {
	private double real;
	private double imag;
	
	public Complex(double r, double i) {
		real = r;
		imag = i;
	}
	double getReal() {
		return real;
	}
	double getImag() {
		return imag;
	}
	public Complex add(Complex c) {
		double resultReal = real + c.getReal();
		double resultImag = imag + c.getImag();
		return new Complex(resultReal, resultImag);
	}
}

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex(12.34, 23.45);
		Complex c2 = new Complex(1.4, 2.5);
		
		c1 = c1.add(c2);
		
		System.out.println(c1.getReal() + " " + c1.getImag());
	}
}








