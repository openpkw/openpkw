package org.openpkw.mapping;

import org.openpkw.model.entity.PeripheralCommittee;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.util.Arrays;

/**
 * Created by wojciech.szostak on 14.08.2015.
 */
public class PeripheralCommitteeFieldSetMapper implements FieldSetMapper<PeripheralCommittee> {
    @Override
    public PeripheralCommittee mapFieldSet(FieldSet fieldSet) throws BindException {
        PeripheralCommittee peripheralCommittee = new PeripheralCommittee();

        try {
            peripheralCommittee.setPkwId(fieldSet.readString(0));
            peripheralCommittee.setTerritoryCode(fieldSet.readLong(4));
            peripheralCommittee.setType(fieldSet.readString(5));
            peripheralCommittee.setName(fieldSet.readString(15));
            try {
                peripheralCommittee.setAllowedToVote(fieldSet.readLong(16));
            } catch (NumberFormatException e) {
                peripheralCommittee.setAllowedToVote(0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(Arrays.toString(fieldSet.getValues()));
        }

//        TODO: all fields from CSV
//        peripheralCommittee.setAreaCode(0);
//        peripheralCommittee.setAddress(null);
//        peripheralCommittee.setIdCommittee(0);
//        peripheralCommittee.setOpmOkregowaKomisjaId(0);

        return peripheralCommittee;
    }
}

