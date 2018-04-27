package core.java.beeperMDTem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	public static void main(String[] args) {
		String patternStr = "(\\+91|\\+1)(\\d{10}|\\(\\d{3}\\)\\s\\d{3}\\-\\d{4})";
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher("+1(980) 288-3865");
		System.out.println(matcher.matches());
	}
}
