package Challenges_In_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joinTheStrings {

	//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		 String words=listOfStrings.stream().collect(Collectors.joining(",","[","]"));
		 System.out.println(words);
		 
				 

	}

}
