package org.openpkw.mapping;

import org.openpkw.model.entity.PeripheralCommittee;
import org.openpkw.transform.PeripherialCommitteeTokenizer;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.stereotype.Service;

/**
 * Created by wojciech.szostak on 17.08.2015.
 */
@Service
public class PeripherialCommitteeLineMapper extends DefaultLineMapper<PeripheralCommittee> {
    public PeripherialCommitteeLineMapper() {
        this.setLineTokenizer(new PeripherialCommitteeTokenizer());
        this.setFieldSetMapper(new PeripheralCommitteeFieldSetMapper());
    }
}
