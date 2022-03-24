package week1day2;

public class assignment1 {
//calculator program
	public int getAdd(int a, int b) {
		return a+b;
	}
	public double getSub(double a,double b) {
		return a-b;
	}
	public double getMultiply(double a,double b) {
		return a*b;
	}
	public double getDivide(double a, double b) {
		return a/b;
	}
	public static void main(String[] args) {
		assignment1 calc = new assignment1();
		System.out.println("CALCULATOR PROGRAM OUTPUT");
		System.out.println("ADDITION = " +calc.getAdd(5,8));
		System.out.println("SUBTRACTION = " +calc.getSub(15.7, 14.2));
		System.out.println("MULTIPLICATION = " +calc.getMultiply(2.5, 2.5));
		System.out.println("DIVISION = " +calc.getDivide(15, 2));
	}
}
