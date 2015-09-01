package org.openpkw.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

/**
 * Created by tola on 2015-07-22.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@RestController
@RequestMapping(value="/api", consumes = {"application/json"}, produces = {"application/json"})
@Qualifier
public @interface OpenPKWAPIController {
}
