package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstjunitTest {
	
	@BeforeAll
    public static void beforeallmethod() {
		
		System.out.println("inside before all");
	}
	
	
	@BeforeEach
	public void beforeeachmethod() {
		
		System.out.println("inside before each");
	}
	
	@Test
	public void testcase1() {
		
		System.out.println("inside testcase1");
			
	}
	
	@AfterEach
    public void aftereach() {

		System.out.println("inside after each");
	}
}
