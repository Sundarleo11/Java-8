package Challenges_In_Java8;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEachWord {

	//Reverse each word of a string using Java 8 streams?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Im a Sundar working in CTS";
		
		String revers_Word=Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		
		//sString revers_Word=Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("revers word :"+revers_Word);

	}

}
