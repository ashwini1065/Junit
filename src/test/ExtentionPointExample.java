package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)
public class ExtentionPointExample {
	
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
