package Challenges_In_Java8;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1456789;

		Integer SumofDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

		System.out.println("SumOfDigits :" + SumofDigits);
	}

}
