package org.openpkw.services;

import org.openpkw.exceptions.CryptographyException;
import org.openpkw.exceptions.ValidationException;
import org.openpkw.model.entity2.User;
import org.openpkw.repositories.UserRepository;
import org.openpkw.validations.EmailValidator;
import org.openpkw.validations.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisteringService {

	// private static final long serialVersionUID = 1L;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CryptographyService cryptographyService;

	public void validationAndSave(User user) throws CryptographyException, ValidationException {

		if (validation(user.getEmail(), user.getPassword())) {
			user.setPassword(cryptographyService.digestPassword(user
					.getPassword()));
			userRepository.save(user);

		} else {
			System.out.println("Nie prawidłowy email lub hasło.");
		}
	}

	public boolean validation(String email, String password) {
		if (EmailValidator.isValid(email)) {
			return PasswordValidator.isValid(password);
		}
		return false;
	}
}
