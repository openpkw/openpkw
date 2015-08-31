package org.openpkw.web.controllers;

import org.openpkw.model.dto.ResultDTO;
import org.openpkw.services.implementation.CurrentResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Karol Dzięgiel on 8/24/2015.
 */
@RestController
public class ResultController {
    @Autowired
    private CurrentResultServiceImpl currentResultServiceImpl;

    @RequestMapping("/result")
    public ResultDTO Result() {
        return currentResultServiceImpl.getResult();
    }
}
