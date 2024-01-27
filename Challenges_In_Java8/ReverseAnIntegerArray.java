package Challenges_In_Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray {

	// Reverse an integer array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] { 5, 1, 7, 3, 9, 6 };

		int[] revers = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

		System.out.println("Revers the Arrays :" + Arrays.toString(revers));

	}

}
