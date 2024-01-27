package Challenges_In_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class separate_odd_and_even_numbers {

	
	//1) Given a list of integers, separate odd and even numbers?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

		Map<Boolean, List<Integer>> MaptheNumber = number.stream().collect(Collectors.partitioningBy(i -> i % 2 != 0));

		// map and save to entry
		Set<Entry<Boolean, List<Integer>>> Entryset = MaptheNumber.entrySet();

		for (Entry<Boolean, List<Integer>> entry : Entryset) {
          //  System.out.println("get Key"+entry.getKey());
			System.out.println("------------------");
			if (!entry.getKey()) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd Number");
			}

			System.out.println("------------------");

			List<Integer> list = entry.getValue();
			for (int i : list) {
				System.out.println(i);
			}
		}

	}

}
