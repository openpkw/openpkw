package org.openpkw.services;

import org.openpkw.model.dto.ResultDTO;
import org.openpkw.model.entity.Result;
import org.openpkw.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Karol Dzięgiel on 8/19/2015.
 */

@Service
public class CurrentResultService {
    @Autowired
    private ResultRepository resultRepository;

    public void test() {
        List<Result> resultList = null;
        for (Result result : resultRepository.findAll()) resultList.add(result);
    }

    public ResultDTO getResult() {
        //TODO
        return null;
    }
}
