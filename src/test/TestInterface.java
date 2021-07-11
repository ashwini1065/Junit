package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestInterface {
	
	public void method1();
	
	@Test
	default void test1()
	
	{
		assertTrue(Stringfunctions.isPalindrome("madam"));
	}

}
