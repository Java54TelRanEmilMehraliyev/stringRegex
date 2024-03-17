package telran.strings;

public class RegularExpresions {

	public static String javaVariable() {
		String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		return regex;
	}

	public static String zero_300() {
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		return regex;
	}
	
	public static String ipOctet() {
		String regex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|0)";
		return regex;
	}
	
	public static String mobileIsraelPhone() {
		
		String regex = "(\\+972-)?0?5[0-9]-[2-9]{3}-?[0-9]{2}-?[0-9]{2}";
		//string contains possible Israel mobile phone number
		//+972-<prefix two digits beginnings from 5>-<7 digits of number>
		// <prefix three digits: first - 0, second 5, third - any> - <7 digits of number>
		return regex;
	}
	
}
