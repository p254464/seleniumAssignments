package Assignments2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,7,6,8};
		Arrays.sort(a);
		int Sum = 0;
		int MissingElement = 0;
		for (int i = 0;  i< a.length; i++) {
		//sum of existing element in array
		Sum = Sum + a[i];
		}
			int Sum1=0;
		for (int J = 1; J <=a.length+1
				; J++) {
			//Sum of all the elements in array including missing number
			Sum1=Sum1+J	;
			//Missing Element= total sum - sum of existing element 
			MissingElement= Sum1 - Sum;
		}
		
		System.out.println("Missing Element in Array is : " + MissingElement );
		
	}

}
