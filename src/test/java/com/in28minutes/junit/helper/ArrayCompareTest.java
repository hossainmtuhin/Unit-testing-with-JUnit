/*
 * study of handling exceptions on unit test
 */

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
	
	// check NullPointerException as Exception test
	@Test
	public void testArraySort_NullArrayUsingTryCatchBlock() {
		int[] numbers = null;	
		try {
			Arrays.sort(numbers); // this will sort numbers array according to ascending number order
		} catch (NullPointerException e) {
			// TODO: handle exception
		}		
	}
	
	// ANOTHER WAY TO check NullPointerException as Exception test
		@Test(expected=NullPointerException.class)
		public void testArraySort_NullArrayUsingExceptionHandlerWithAnnotation() {
			int[] numbers = null;	
			Arrays.sort(numbers); // this will sort numbers array according to ascending number order		
		}

}
