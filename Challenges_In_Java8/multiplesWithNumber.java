package Challenges_In_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class multiplesWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number :");
		
		int num = sc.nextInt();

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		listOfIntegers.stream().filter(i -> i % num == 0).forEach(System.out::println);

	}

}
