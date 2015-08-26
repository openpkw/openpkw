package org.openpkw.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	private static final String PASSWORD_PATTERN = "^[_A-Za-z0-9-]{6,10}$";

	private PasswordValidator() {
	}

	public static boolean isValid(final String password) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);

		return matcher.matches();

	}

}
