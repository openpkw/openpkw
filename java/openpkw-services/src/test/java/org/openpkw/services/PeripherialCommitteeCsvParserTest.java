package org.openpkw.services;

import org.openpkw.mapping.PeripherialCommitteeLineMapper;
import org.openpkw.model.entity.PeripheralCommittee;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

/**
 * Created by wojciech.szostak on 15.08.2015.
 */
public class PeripherialCommitteeCsvParserTest {

    private PeripherialCommitteeCsvParser csvParser;

    @BeforeClass
    public void init(){
        csvParser = new PeripherialCommitteeCsvParser(
                new PeripherialCommitteeLineMapper());
    }

    @Test
    public void canParseFile(){
        File tmpFile = new File("src/test/resources/pollstations.csv");
        List<PeripheralCommittee> result = csvParser.parse(tmpFile);

        Assert.assertEquals(result.get(0).getPkwId(), "020101");
        Assert.assertEquals(result.get(0).getTerritoryCode(), 1);
        Assert.assertEquals(result.get(1).getAllowedToVote(), 1394);
    }

    public void notNumberAllowedToVoteMapsToZero(){
        File tmpFile = new File("src/test/resources/pollstations.csv");
        List<PeripheralCommittee> result = csvParser.parse(tmpFile);

        Assert.assertEquals(result.get(2).getAllowedToVote(), 0);
    }
}
