package com.in28minutes.junit.helper;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Positions() {
		// AACD => CD    ACD => CD   CDEF => CDEF   CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition() {
		//assertEquals(expected, actual)
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoAInFirst2Positions() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInLast2Positions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
//	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		
	}
}
