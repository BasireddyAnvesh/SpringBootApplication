package com.javaeight.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 * @author Anvesh
 * This class shows some of the features newly added in Java 8 
 * like Stream API, ForEach Iterator for List and Lambda.
 *
 */
public class JavaEightFeatures {
public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			myList.add(i);
		}
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> parallelNumbers = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		parallelNumbers.forEach(p -> System.out.println("Parallel numbers: "+p));
		
		Stream<Integer> sequentialNumbers = sequentialStream.filter(p -> p > 90);
		sequentialNumbers.forEach(p -> System.out.println("Sequential numbers: "+p));

	}
}
