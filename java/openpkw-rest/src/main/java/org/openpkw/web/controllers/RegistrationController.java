package org.openpkw.web.controllers;

import org.openpkw.exceptions.CryptographyException;
import org.openpkw.exceptions.ValidationException;
import org.openpkw.model.entity.User;
import org.openpkw.model.entity.UserType;
import org.openpkw.services.RegisteringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration/{firstName}/{lastName}/{email}/{password}/{userName}")
public class RegistrationController {

	@Autowired
	private RegisteringService registeringService;

	@RequestMapping(method = RequestMethod.POST)
	void registerUser(@PathVariable String firstName,
			@PathVariable String lastName, @PathVariable String email,
			@PathVariable String password, @PathVariable String userName) {

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setIsActive(true);
		user.setUserType(UserType.VOLUNTEER);
		try {
			registeringService.validationAndSave(user);
		} catch (CryptographyException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			System.out.println("Nie prawidłowy email lub hasło.");
			e.printStackTrace();
		}
	}
}
