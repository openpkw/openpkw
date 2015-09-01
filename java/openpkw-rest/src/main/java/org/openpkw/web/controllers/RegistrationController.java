package org.openpkw.web.controllers;

import org.openpkw.exceptions.CryptographyException;
import org.openpkw.exceptions.ValidationException;
import org.openpkw.model.entity.User;
import org.openpkw.model.entity.UserType;
import org.openpkw.qualifier.OpenPKWAPIController;
import org.openpkw.services.RegisteringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@OpenPKWAPIController
public class RegistrationController {

	@Autowired
	private RegisteringService registeringService;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	ResponseEntity<Object> registerUser(@RequestParam String firstName,
										@RequestParam String lastName, @RequestParam String email,
										@RequestParam String password, @RequestParam String userName) {

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setIsActive(true);
		user.setUserType(UserType.VOLUNTEER);
		try {
			registeringService.validationAndSave(user);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (CryptographyException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			System.out.println("Nie prawidłowy email lub hasło.");
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	}
}
