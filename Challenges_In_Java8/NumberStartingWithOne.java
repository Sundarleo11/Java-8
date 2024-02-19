package Challenges_In_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().map(s->s + "").filter(i->i.startsWith("1")).forEach(System.out::println);
	

	}

}
