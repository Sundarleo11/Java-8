package Challenges_In_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateElements {

	// How do you remove duplicate elements from a list using Java 8 streams?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

		List<String> UniqueStringvalue = listOfStrings.stream().distinct().collect(Collectors.toList());

		System.out.println(UniqueStringvalue);

	}

}
