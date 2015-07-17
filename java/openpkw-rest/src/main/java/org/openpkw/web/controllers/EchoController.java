package org.openpkw.web.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @author Tomasz Łabuz on 2015-07-17.
 */
@RestController
@RequestMapping(value="/api", consumes = {"application/json"}, produces = {"application/json"})
public class EchoController {

    @RequestMapping(value = "/echo",
            method = RequestMethod.POST
    )
    public Map echo(@RequestBody Map object) {

        return object;
    }


}
