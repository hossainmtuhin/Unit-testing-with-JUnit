package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {13, 12, 3, 4};
		int[] expected = {3, 4, 12, 13};
		
		Arrays.sort(numbers); // this will sort numbers array according to ascending number order
		
		assertArrayEquals(expected, numbers);
	}

}
