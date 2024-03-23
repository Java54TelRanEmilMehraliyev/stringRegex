package telran.strings;

public class Validations {

	public static boolean isArithmeticExpression(String expression) {

		String regex = RegularExpresions.arithmeticExpression();
		boolean regexMatch = expression.matches(regex);
		return regexMatch && isBracketsParity(expression);
	}

	private static boolean isBracketsParity(String expression) {
		int count = 0;
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (ch == '(') {
				count++;
			} else if (ch == ')') {
				count--;
				if (count < 0) {
					return false;
				}
			}
		}
		return count == 0;
	}
}