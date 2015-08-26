package org.openpkw.mapping;

import org.openpkw.model.entity.PeripheralCommittee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.util.Arrays;

/**
 * Created by wojciech.szostak on 14.08.2015.
 */
public class PeripheralCommitteeFieldSetMapper implements FieldSetMapper<PeripheralCommittee> {

    public static final Logger LOGGER = LoggerFactory.getLogger(PeripheralCommitteeFieldSetMapper.class);

    @Override
    public PeripheralCommittee mapFieldSet(FieldSet fieldSet) throws BindException {
        PeripheralCommittee peripheralCommittee = new PeripheralCommittee();

        if (fieldSet.getFieldCount() < 17) {
            LOGGER.info("Wrong line format: {}", fieldSet.getValues());
            return null;
        }

        peripheralCommittee.setPkwId(
                fieldSet.readLong(0) + "-" + fieldSet.readLong(4));

        peripheralCommittee.setTerritoryCode(fieldSet.readLong(0));
        peripheralCommittee.setAreaCode(fieldSet.readLong(4));

        peripheralCommittee.setAddress(
                fieldSet.readString(12) + " " + fieldSet.readString(13) + "\n" +
                fieldSet.readString(10) + " " + fieldSet.readString(11));

        peripheralCommittee.setType(fieldSet.readString(5));
        peripheralCommittee.setName(fieldSet.readString(15));

        try {
            peripheralCommittee.setAllowedToVote(fieldSet.readLong(16));
        } catch (NumberFormatException e) {
            peripheralCommittee.setAllowedToVote(0L);
        }

//        TODO: all fields from CSV
//        peripheralCommittee.setIdCommittee(0);
//        peripheralCommittee.setOpmOkregowaKomisjaId(0);

        return peripheralCommittee;
    }
}

