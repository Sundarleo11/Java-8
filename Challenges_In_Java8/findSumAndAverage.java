package Challenges_In_Java8;

import java.util.Arrays;
import java.util.List;

public class findSumAndAverage {

	// Given an integer array, find sum and average of all elements?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		int Sum = Arrays.stream(a).sum();
		System.out.println("Sum of Arrays: " + Sum);
		Double avg = Arrays.stream(a).average().getAsDouble();
		System.out.println("Average of Arrays: " + avg);
		
		int sum=0;
		for(int i:list1) {
			sum+=i;
		}
		System.out.println("list of sum :"+sum);

	}

}
