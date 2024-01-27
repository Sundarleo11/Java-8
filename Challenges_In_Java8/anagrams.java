package Challenges_In_Java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anagrams {

	// Java 8 program to check if two strings are anagrams or not?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s1 = "RaceCar";
		//String s2 = "CarRace";
		
		String s1 = "RaceCar";
		String s2 = "CarRace";

		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

	
		if (s1.equals(s2)) {
			System.out.println("both are same in anagrams");
		} else {
			System.out.println("it's not an anagrams");
		}

	}

}
