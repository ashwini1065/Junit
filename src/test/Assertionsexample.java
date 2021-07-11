package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Assertionsexample {
	
	
	
	
	@Test
	public void test1()
	{
	String expected = "hi there";
	String actual = "hi there";
	
	
	
	// Assertions .assertEquals(expected,actual)
	assertEquals(expected, actual);
	
	 String[] expectedArray = {"one", "two", "three"};
     String[] resultArray =  {"one", "two", "three"};
     
     
     assertArrayEquals(expectedArray,resultArray);
     
     boolean flag =true;
     assertTrue(flag);
	
	}

}
