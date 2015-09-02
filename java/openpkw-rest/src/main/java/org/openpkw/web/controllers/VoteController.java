package org.openpkw.web.controllers;

import org.openpkw.model.voting.VoteRequest;
import org.openpkw.model.voting.VoteResponse;
import org.openpkw.qualifier.OpenPKWAPIController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tola on 2015-07-22.
 */

@Controller
//@OpenPKWAPIController
public class VoteController {


    @RequestMapping(value = "/vote")
    public VoteResponse vote(VoteRequest request) {





        return new VoteResponse();
    }


}
