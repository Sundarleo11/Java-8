package Challenges_In_Java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfEachCharacter {
	
	//How do you find frequency of each character in a string using Java 8 streams?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "Java Concept Of The Day";

		Map<Character, Long> counts = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(counts);
	}

}
