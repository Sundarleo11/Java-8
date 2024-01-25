package Challenges_In_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class oddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> oddnumber = number.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());
		
		System.out.println(oddnumber);

	}

}
