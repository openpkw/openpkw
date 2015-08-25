package org.openpkw.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
		
	private Pattern pattern;
	private Matcher matcher;

	private static final String PASSWORD_PATTERN = "^[_A-Za-z0-9-]{6,10}$";
	
	public boolean validate(final String password) {
		pattern = Pattern.compile(PASSWORD_PATTERN);
		matcher = pattern.matcher(password);
		return matcher.matches();

	}

}
