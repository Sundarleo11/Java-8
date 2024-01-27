package Challenges_In_Java8;

import java.util.stream.IntStream;

public class first10EvenNumbers {

	// Print first 10 even numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);

	}

}
