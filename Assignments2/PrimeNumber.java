package Assignments2;

//primeNumber is divisible by itself and by 1 
//should not be divisible by (2,3,4,5,6,78,9,10,11,12))
public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = true;

		for (int i = 2; i < input; i++) {
			
			if (input % i == 0) {
				
				flag = false;
				break;
			}
		}
			if (flag) {

				System.out.println(input + " is a Prime number");

			} else {
				System.out.println(input + " is not a Prime number");

			}

		}

}
