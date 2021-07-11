package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamtersExample {
	
	
	@ParameterizedTest
	@ValueSource(strings = {"radar","madam","ashwini"})
	public void PalindromeCheck(String name) {
		
		assertTrue(Stringfunctions.isPalindrome(name));
	}

	@ParameterizedTest
	@ValueSource(ints = {2,4,6,9})
	public void Oddnumberheck(int num) {
		
		assertTrue(num%2!=0);
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	void MonthTest(Month month) {
		
		int monthNumber = month.getValue();
		Assertions.assertTrue(monthNumber >= 1 && monthNumber <=12);
	}
	
	@ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void someMonths_Are30DaysLong(Month month) {
        
        Assertions.assertEquals(30, month.length(false));
    }
	
}
