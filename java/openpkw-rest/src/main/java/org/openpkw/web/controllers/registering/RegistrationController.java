package org.openpkw.web.controllers.registering;

import org.openpkw.exceptions.CryptographyException;
import org.openpkw.exceptions.ValidationException;
import org.openpkw.model.entity.User;
import org.openpkw.qualifier.OpenPKWAPIController;
import org.openpkw.services.RegisteringService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@OpenPKWAPIController
@RequestMapping(value = "/user", consumes = {"application/json"}, produces = {"application/json"})
public class RegistrationController {

    public static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private RegisteringService registeringService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    ResponseEntity<Object> registerUser(@RequestBody RegisterUserRequest request) {
        User user = request.getUser();
        try {
            registeringService.validationAndSave(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (CryptographyException e) {
            logger.error(e.getLocalizedMessage(), e);
        } catch (ValidationException e) {
            System.out.println("Nie prawidłowy email lub hasło.");
            logger.error(e.getLocalizedMessage(), e);
        }
        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
}
