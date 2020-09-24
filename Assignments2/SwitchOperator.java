package Assignments2;


public class SwitchOperator {
	
	public int add(int a, int b ) {
		return a+b;
		}
	public int sub(int x, int y) {
		return x-y;
	}
	
	public int mult(int m,int n) {
		return m*n;
	}
	
	public int div(int c,int d) {
		return c/d;
	}
	

	public static void main(String[] args) {
		
		SwitchOperator R = new SwitchOperator();
			
		String operator="three";
				
		switch (operator) {
		case "one":	
			int add= R.add(10,20);
			System.out.println(add);
			break;
		case "two":	int sub= R.sub(30,20);
			System.out.println(sub);
			break;
		case "three": int mult= R.mult(20,40);
			System.out.println(mult);
			break;
			
		default:
		case "four":int div = R.div(40,2);
			System.out.println(div);
					}
	}

}
