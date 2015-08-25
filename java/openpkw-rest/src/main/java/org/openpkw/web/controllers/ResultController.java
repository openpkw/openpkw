package org.openpkw.web.controllers;

import org.openpkw.model.dto.ResultDTO;
import org.openpkw.services.CurrentResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Karol Dzięgiel on 8/24/2015.
 */
@RestController
public class ResultController {
    @Autowired
    private CurrentResultService currentResultService;

    @RequestMapping("/result")
    public ResultDTO Result() {
        return currentResultService.getResult();
    }
}
