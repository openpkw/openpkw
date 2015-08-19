package org.openpkw.services;

import org.openpkw.repositories.PeripheralCommitteeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Karol Dzięgiel on 8/19/2015.
 */

@Service
public class CurrentResultsService {
    @Autowired
    private PeripheralCommitteeRepository peripheralCommitteeRepository;

}
