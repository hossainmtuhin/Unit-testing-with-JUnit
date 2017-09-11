package com.in28minutes.junit.helper;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();
	
	// AACD => CD    ACD => CD   CDEF => CDEF   CDAA => CDAA
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Positions() {
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
	
	
	// ABCD => false   ABAB => true   AB => true   A => false
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse("first and last 2 char are same", helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test 
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue("first and last 2 char are NOT same", helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenarioWhenOnly2Characters() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenarioForSingleChar() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
