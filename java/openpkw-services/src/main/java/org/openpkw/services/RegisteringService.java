package org.openpkw.services;

import org.openpkw.exceptions.ValidatingException;
import org.openpkw.model.entity.User;
import org.openpkw.repositories.UserRepository;
import org.openpkw.validations.EmailValidation;
import org.openpkw.validations.PasswordValidation;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisteringService extends Exception {

	// private static final long serialVersionUID = 1L;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordValidation passwordValidation;

	@Autowired
	private EmailValidation emailValidation;

	public void validationAndSave(User user) throws ValidatingException {

		if (emailValidation.validate(user.getEmail()) == true
				&& passwordValidation.validate(user.getPassword()) == true) {
			
			userRepository.save(user);

		} else {
			System.out.println("Proszę poprawić email lub hasło.");
		}
	}
}
