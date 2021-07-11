package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionsExample {
	
	@BeforeAll
	public static void setup()
	{
		System.setProperty("Env", "Prod");	}
	
	@Test
	public void test1()
	{
		assumeTrue("Dev".equals(System.getProperty("Env")));
		assertTrue(Stringfunctions.isPalindrome("madam"));
		
	
	}
	@Test
	public void test2()
	{
		assumeTrue("Prod".equals(System.getProperty("Env")));
		assertFalse(Stringfunctions.isPalindrome("ashwini"));
	}

}
