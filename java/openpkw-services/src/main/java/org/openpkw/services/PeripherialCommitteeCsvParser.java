package org.openpkw.services;

import org.openpkw.mapping.PeripherialCommitteeLineMapper;
import org.openpkw.model.entity.PeripheralCommittee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wojciech.szostak on 15.08.2015.
 */
@Service
public class PeripherialCommitteeCsvParser extends CsvParser<PeripheralCommittee>{
    @Autowired
    public PeripherialCommitteeCsvParser(PeripherialCommitteeLineMapper defaultLineMapper) {
        super(defaultLineMapper);
    }
}
