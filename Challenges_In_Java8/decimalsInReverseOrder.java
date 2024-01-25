package Challenges_In_Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class decimalsInReverseOrder {

   //How do you sort the given list of decimals in reverse order?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		
		//decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		// Operator space with comma
		List<Double> decimalLists=decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		for(Double I : decimalLists) {
			System.out.print(I+", ");
			
		}
		//System.out.println("--------------");
		//List<Integer> intNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17);
		//intNumber.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

	}

}
