package org.openpkw.services;

import org.openpkw.mapping.PeripherialCommitteeLineMapper;
import org.openpkw.model.entity.PeripheralCommittee;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
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
    public void canParseFileSkipingFailedLines() {
        File tmpFile = new File("src/test/resources/pollstations.csv");
        List<PeripheralCommittee> result = null;
        try {
            result = csvParser.parse(tmpFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(result.size(), 2);

        PeripheralCommittee firstLine = result.get(0);
        Assert.assertEquals(firstLine.getPkwId(), "20101-1");
        Assert.assertEquals(firstLine.getTerritoryCode(), 20101);

        PeripheralCommittee secondLine = result.get(1);
        Assert.assertEquals(secondLine.getTerritoryCode(), 20101);
        Assert.assertEquals(secondLine.getAreaCode(), 2);
        Assert.assertEquals(secondLine.getPkwId(), "20101-2");
        Assert.assertEquals(secondLine.getType(), "COMM");
        Assert.assertEquals(secondLine.getName(), "Szkoła Podstawowa Nr 3");
        Assert.assertEquals(secondLine.getAddress(), "ul. Ceramiczna 5\n59-700 Bolesławiec");
        Assert.assertEquals(secondLine.getAllowedToVote(), 1394);
    }

    @Test
    public void notNumberAllowedToVoteMapsToZero() throws Exception {
        File tmpFile = new File("src/test/resources/pollstations-unknown-allowed-to-vote.csv");
        List<PeripheralCommittee> result = csvParser.parse(tmpFile);
        Assert.assertEquals(result.get(0).getAllowedToVote(), 0);
    }

    @Test
    public void treatQuotationMarksAsText() throws Exception {
        File tmpFile = new File("src/test/resources/pollstations-quotes.csv");
        List<PeripheralCommittee> result = csvParser.parse(tmpFile);
        Assert.assertEquals(result.get(0).getName(), "Muzeum Miejskie \"Saturn");
    }

    @Test
    public void shouldThrowExceptionWhenFileNotFound() {
        Throwable e = null;
        File tmpFile = new File("unknown");

        try {
            csvParser.parse(tmpFile);
        } catch (Exception ex) {
            e = ex;
        }

        Assert.assertTrue(e instanceof FileNotFoundException);

    }
}
