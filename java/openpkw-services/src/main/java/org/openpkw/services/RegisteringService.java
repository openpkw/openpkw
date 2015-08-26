package org.openpkw.services;

import org.openpkw.exceptions.CryptographyException;
import org.openpkw.model.entity.User;
import org.openpkw.repositories.UserRepository;
import org.openpkw.validations.EmailValidation;
import org.openpkw.validations.PasswordValidation;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisteringService {

	// private static final long serialVersionUID = 1L;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordValidation passwordValidation;

	@Autowired
	private CryptographyService cryptographyService;

	@Autowired
	private EmailValidation emailValidation;

	public void validationAndSave(User user) throws CryptographyException {

		if (emailValidation.validate(user.getEmail()) == true
				&& passwordValidation.validate(user.getPassword()) == true) {
			user.setPassword(cryptographyService.digestPassword(user.getPassword()));
			userRepository.save(user);

		} else {
			System.out.println("Proszę poprawić email lub hasło.");
		}
	}
}
