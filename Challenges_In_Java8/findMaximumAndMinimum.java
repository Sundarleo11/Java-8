package Challenges_In_Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findMaximumAndMinimum {

	//Given a list of integers, find maximum and minimum of those numbers?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		int max=listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("Max number in List :"+max);
		
		int min=listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println("Min number in List :"+min);

	}

}
