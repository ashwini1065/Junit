package test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class disableExamples {
	
	
	@CustomAnnotation
	public void test1()
	{
		assertTrue(Stringfunctions.isPalindrome("madam"));
		
	}

	@DisplayName("Negative Test")
	@RepeatedTest(5)
	@Test
	
	public void test2()
	
	{
		assertFalse(Stringfunctions.isPalindrome("ashwini"));
	}
}
