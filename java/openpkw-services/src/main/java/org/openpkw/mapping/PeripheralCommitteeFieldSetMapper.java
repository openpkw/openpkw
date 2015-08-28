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

        peripheralCommittee.setPkwId(
                fieldSet.readString("teryt-gminy") + "-" + fieldSet.readString("numer-obwodu"));
        // peripheralCommittee.setTerritoryCode(fieldSet.readLong(0));
        peripheralCommittee.setAreaCode(fieldSet.readLong("numer-obwodu"));
        peripheralCommittee.setName(fieldSet.readString("siedziba"));
        peripheralCommittee.setAddress(fieldSet.readRawString("pelna-siedziba"));
        peripheralCommittee.setType(fieldSet.readString("typ-obszaru"));

        try {
            peripheralCommittee.setAllowedToVote(fieldSet.readLong("liczba-wyborcow"));
        } catch (NumberFormatException e) {
            peripheralCommittee.setAllowedToVote(0L);
        }

        return peripheralCommittee;
    }
}

