package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telran.strings.RegularExpresions;

class RegularExpressionsTests {

	@Test
	void javaVariableTrueTest() {
		
		String regex = RegularExpresions.javaVariable();
		assertTrue("abs".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$1_23".matches(regex));
		assertTrue("abs_".matches(regex));
		assertTrue("__".matches(regex));
		assertTrue("Abs_".matches(regex));
	}
	@Test
	void javaVariableFalseTest() {
		String regex = RegularExpresions.javaVariable();
		assertFalse("1abc".matches(regex));
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("a 2".matches(regex));
		assertFalse("a?2".matches(regex));
		assertFalse("i*nt".matches(regex));
		
	}
	@Test
	void zero_300TrueTest() {
		String regex = RegularExpresions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("198".matches(regex));
		assertTrue("299".matches(regex));
		assertTrue("30".matches(regex));
		assertTrue("33".matches(regex));
		assertTrue("300".matches(regex));
		
		
	}
	@Test
	void zero_300FalseTest() {
		String regex = RegularExpresions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("398".matches(regex));
		assertFalse("2990".matches(regex));
		assertFalse("-30".matches(regex));
		assertFalse("330".matches(regex));
		assertFalse("301".matches(regex));
		
		
	}
	@Test
	void ipOctetTest() {
		String regex = RegularExpresions.ipOctet();
		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("255".matches(regex));
		assertTrue("250".matches(regex));
		assertTrue("249".matches(regex));
		assertFalse("-0".matches(regex));
		assertFalse("00 ".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("1900".matches(regex));
		assertFalse("299".matches(regex));
		assertFalse("00a".matches(regex));
		assertFalse("256".matches(regex));
		assertFalse("260".matches(regex));
		assertFalse("300".matches(regex));
		}
    @Test
    void mobileIsraelPhoneTest() {
    	String regex = RegularExpresions.mobileIsraelPhone();
    	assertTrue("+972-53-2845341".matches(regex));
    	assertTrue("053-2845341".matches(regex));
    	assertTrue("053-284-53-41".matches(regex));
        assertTrue("54-722-33-44".matches(regex));
    	assertFalse("97253-284-53-41".matches(regex));
    }
    
    @Test
    @DisplayName("test for IP v4 address RegEx")
    void ipV4AddressTest() {
    	String ipV4Regex = RegularExpresions.ipV4Address();
    	assertTrue("1.2.3.4".matches(ipV4Regex));
    	assertFalse("1.2.3".matches(ipV4Regex));
    	assertFalse("1 2.3.4".matches(ipV4Regex));
    	assertFalse("1.2.3.4.5".matches(ipV4Regex));
    	assertFalse("1.2.3&4".matches(ipV4Regex));
    }
    
    @Test
    @DisplayName("test for simp.arithm.express")
    void simpleArithmeticExpressionsTest() {
    	String regex = RegularExpresions.commonArithmeticExpression();
    	assertTrue("20".matches(regex));
    	assertTrue(" 20 +3 /2 *100".matches(regex));
    	assertTrue("10000-1".matches(regex));
    	assertTrue("10000-1 ".matches(regex));
    	assertFalse("-20".matches(regex));
    	assertFalse("20 ** 3".matches(regex));
    	assertFalse(" 20 +3 /2 *100 +".matches(regex));
    	assertFalse(" 20 +3 //2 *100 +".matches(regex));
    }
    @Test
    @DisplayName("test of arithmeticExpressions with numbers or variables and brackets")
    void arithmeticExpressionTest() {
    	String regex = RegularExpresions.arithmeticOperandExpression();
    	assertTrue("(20.5 + abc)*2".matches(regex));
    	assertTrue("(20.5 + abc))*2".matches(regex));
    	assertTrue("(20.5 + abc / 3)*(2".matches(regex));
    	assertTrue("(20.5 + (abc / 3)*(2".matches(regex));
    	assertTrue("(abc)*2".matches(regex));
    	assertTrue("__".matches(regex));
    	assertFalse("2 + a12 * ".matches(regex));
    	assertFalse("2 + )a12 * ".matches(regex));
    	assertFalse("(2 + )a12 * ".matches(regex));


    }
}

