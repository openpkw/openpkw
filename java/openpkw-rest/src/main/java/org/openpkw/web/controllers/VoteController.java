package org.openpkw.web.controllers;

import org.openpkw.model.voting.VoteRequest;
import org.openpkw.model.voting.VoteResponse;
import org.openpkw.qualifier.OpenPKWAPIController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tola on 2015-07-22.
 */

@OpenPKWAPIController
public class VoteController {


    @RequestMapping(value = "/vote")
    public VoteResponse vote(VoteRequest request) {



        return new VoteResponse();
    }


}
