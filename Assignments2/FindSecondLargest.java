package Assignments2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int n=data.length;
		Arrays.sort(data);
		int secondLargest= data[n-2];
		System.out.println("The Second Largest Number is "+ secondLargest);
	
	}

}
