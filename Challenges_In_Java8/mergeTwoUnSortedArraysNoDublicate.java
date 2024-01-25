package Challenges_In_Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mergeTwoUnSortedArraysNoDublicate {

	
	//How do you merge two unsorted arrays into single sorted array without duplicates?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {4, 2, 9, 1};
        
        int[] b = new int[] {8, 1, 9, 5};
        
        int[]c=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();

        System.out.println(Arrays.toString(c));
        
	}

}
