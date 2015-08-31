package org.openpkw.mapping;

import org.openpkw.model.entity.PeripheralCommittee;
import org.openpkw.model.entity.PeripheralCommitteeAddress;
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
        PeripheralCommitteeAddress peripheralCommitteeAddress = new PeripheralCommitteeAddress();

        peripheralCommittee.setTerritorialCode(fieldSet.readString("teryt-gminy"));
        // peripheralCommittee.setTerritoryCode(fieldSet.readLong(0));
        peripheralCommittee.setPeripheralCode("" + fieldSet.readLong("numer-obwodu"));
        peripheralCommittee.setName(fieldSet.readString("siedziba"));
//        peripheralCommittee.setAddress(fieldSet.readRawString("pelna-siedziba"));
        peripheralCommittee.setType(fieldSet.readString("typ-obszaru"));

        try {
            peripheralCommittee.setAllowedToVote(fieldSet.readLong("liczba-wyborcow"));
        } catch (NumberFormatException e) {
            peripheralCommittee.setAllowedToVote(0L);
        }

        return peripheralCommittee;
    }
}

