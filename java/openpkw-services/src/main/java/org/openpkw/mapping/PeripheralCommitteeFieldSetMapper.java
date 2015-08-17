package org.openpkw.mapping;

import org.openpkw.model.entity.PeripheralCommittee;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * Created by wojciech.szostak on 14.08.2015.
 */
public class PeripheralCommitteeFieldSetMapper implements FieldSetMapper<PeripheralCommittee> {
    @Override
    public PeripheralCommittee mapFieldSet(FieldSet fieldSet) throws BindException {
        PeripheralCommittee peripheralCommittee = new PeripheralCommittee();

        peripheralCommittee.setPkwId(fieldSet.readString(0));
        peripheralCommittee.setTerritoryCode(fieldSet.readLong(4));

        try {
            peripheralCommittee.setAllowedToVote(fieldSet.readLong(16));
        } catch (NumberFormatException e) {
            peripheralCommittee.setAllowedToVote(0);
        }

        // TODO: all fields from CSV

        return peripheralCommittee;
    }
}
