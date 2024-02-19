package Challenges_In_Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		// Map the List of each words with count
		Map<String, Long> values = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Duplicate words
		Map<String, Long> words = stationeryList.stream().filter(s -> Collections.frequency(stationeryList, s) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("world" + words);
		System.out.println("values" + values);

		// world{Pen=2, Pencil=2, Note Book=2}
		// values{Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}

	}

}
