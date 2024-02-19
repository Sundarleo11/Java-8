package Challenges_In_Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfEachCharacter {

	// How do you find frequency of each character in a string using Java 8 streams?

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day";

		// first came for space 4 as count
		Map<Character, Long> counts = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		/*
		 * The main difference between HashMap and LinkedHashMap is that LinkedHashMap
		 * maintains
		 * the insertion order of keys, the order in which keys are inserted into
		 * LinkedHashMap.
		 * On the other hand, HashMap doesn't maintain any order or keys, or values.
		 */
		Map<String, Long> count1 = Arrays.stream(inputString.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println("count1" + count1);
		System.out.println("counts" + counts);

		// count1{j=1, a=3, v=1, =4, c=2, o=2, n=1, e=2, p=1, t=2, f=1, h=1, d=1, y=1}
		// counts{ =4, a=3, c=1, C=1, D=1, e=2, f=1, h=1, J=1, n=1, O=1, o=1, p=1, T=1,
		// t=1, v=1, y=1}
	}

}
