package org.openpkw.web.configuration;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tomasz Łabuz on 2015-07-17.
 */
@ComponentScan(basePackages = "org.openpkw",
        excludeFilters = {@ComponentScan.Filter(value = {Controller.class, RestController.class})})
@ImportResource(value = {"classpath*:/META-INF/spring/openpkw-*.xml"})
public class AppConfig {


}

