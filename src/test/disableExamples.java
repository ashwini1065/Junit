package test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class disableExamples {
	
	@DisplayName("Positive Test")
	@Disabled
	@Test
	
	public void test1()
	{
		assertTrue(Stringfunctions.isPalindrome("madam"));
		
	}

	@DisplayName("Negative Test")
	@Test
	
	public void test2()
	
	{
		assertFalse(Stringfunctions.isPalindrome("ashwini"));
	}
}
