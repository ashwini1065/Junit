package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;

public class DynamicTestExample {
	
	@TestFactory
    public Collection<DynamicTest> method1() {
        
        return Arrays.asList(
                  DynamicTest.dynamicTest("Positive Test",
                          () -> assertTrue(Stringfunctions.isPalindrome("madam"))),
                    DynamicTest.dynamicTest("Negative Test Test",
                      () -> assertFalse(Stringfunctions.isPalindrome("ashwini"))));
        
    }

}
