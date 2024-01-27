package Challenges_In_Java8;

import java.util.stream.IntStream;

public class naturalNumbers {

	//How do you find sum of first 10 natural numbers?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=IntStream.range(1, 11).sum();
		System.out.println("First 10 natural Number: "+sum);

	}

}
