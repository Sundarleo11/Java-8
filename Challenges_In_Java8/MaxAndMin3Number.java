package Challenges_In_Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin3Number {

	// How do you get three maximum numbers and three minimum numbers from the given
	// list of integers?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		System.out.println("--------------");
		System.out.println("Minimum 3 number ");
		System.out.println("--------------");

		listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

		System.out.println("--------------");
		System.out.println("Maximum 3 number ");
		System.out.println("--------------");

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

}
