package Challenges_In_Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInt {

	//How to find duplicate elements in a given integers list in java using Stream functions?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet();
		//myList.stream().distinct().forEach(System.out::println);
		myList.stream().filter(n-> !set.add(n)).forEach(System.out::println);

	}

}
