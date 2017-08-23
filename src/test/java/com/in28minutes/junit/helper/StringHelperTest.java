package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();
	
	@Test
	public void test() {
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		// AACD => CD    ACD => CD   CDEF => CDEF   CDAA => CDAA
		assertEquals(expected, actual);
	}
	//as a negative test => org.junit.ComparisonFailure: expected:<ABC[]> but was:<ABC[D]>


	
}
