package org.openpkw.mapping;

import org.openpkw.model.entity.PeripheralCommittee;
import org.openpkw.transform.PeripherialCommitteeTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.IncorrectTokenCountException;
import org.springframework.stereotype.Service;

/**
 * Created by wojciech.szostak on 17.08.2015.
 */
@Service
public class PeripherialCommitteeLineMapper extends DefaultLineMapper<PeripheralCommittee> {
    public static final Logger LOGGER = LoggerFactory.getLogger(PeripheralCommitteeFieldSetMapper.class);

    public PeripherialCommitteeLineMapper() {
        this.setLineTokenizer(new PeripherialCommitteeTokenizer());
        this.setFieldSetMapper(new PeripheralCommitteeFieldSetMapper());
    }

    @Override
    public PeripheralCommittee mapLine(String line, int lineNumber) throws Exception {
        PeripheralCommittee peripheralCommittee = null;
        try {
            peripheralCommittee = super.mapLine(line, lineNumber);
        } catch (IncorrectTokenCountException e) {
            LOGGER.info("Wrong line format: {}", line);
        }
        return peripheralCommittee;
    }
}
