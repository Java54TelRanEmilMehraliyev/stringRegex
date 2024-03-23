package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import telran.strings.Validations;



class ValidationsTest {

	@Test
	void testIsArithmeticExpression() {
		assertTrue(Validations.isArithmeticExpression("(a+b)*(a+b)"));
		assertTrue(Validations.isArithmeticExpression("((a+b)+(b+a)) * 10.5"));
		assertTrue(Validations.isArithmeticExpression("20.1 + 15.8"));
		assertFalse(Validations.isArithmeticExpression("a +() 31")); 
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc1))*2"));
		assertFalse(Validations.isArithmeticExpression("(a+b))/((b-a)"));
	}

}
