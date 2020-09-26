package week3.day1;



public class Calculator {
	
	public void addition(int a,int b) {
		int add=a+b;
		System.out.println("Addiion1="+add);
	}
	public void addition(int a,int b,int c) {
		int add=a+b+c;
		System.out.println("Addiion2="+add);
	}
	public void mult(int c,int d) {
		int mult=c*d;
		System.out.println("Mult1="+ mult);
	}
	public void multiption(int c,double d) {
		double mult=c*d;
		System.out.println("Mult2="+mult);
	}
	public void subtraction(int m,int n) {
		int sub=m-n;
		System.out.println("Sub1="+sub);
	}
	public void subtraction(double m,double n) {
		double sub=m-n;
		System.out.println("Sub2="+sub);
	}
	public void division(int o,int p) {
		int div= o/p;
		System.out.println("Div1="+div);
	}
	public void div(double o,int p) {
		double div= o/p;
		System.out.println("Div2="+div);
		
	}
	

	public static void main(String[] args) {
		
		Calculator Result = new Calculator();
		Result.addition(5, 6);
		Result.addition(5, 9, 8);
		Result.mult(5, 2);
		Result.multiption(9, 5.5);
		Result.subtraction(70.5, 50.5);
		Result.subtraction(80, 60);
		Result.div(80.5, 5);
		Result.division(90, 10);
	
	}

}
