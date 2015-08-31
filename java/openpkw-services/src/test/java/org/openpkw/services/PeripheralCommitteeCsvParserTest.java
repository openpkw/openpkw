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
public class PeripheralCommitteeCsvParserTest {
    private PeripheralCommitteeCsvParser csvParser;

    @BeforeClass
    public void init(){
        csvParser = new PeripheralCommitteeCsvParser(
                new PeripherialCommitteeLineMapper());
    }

    @Test
    public void canParseFileSkippingFailedLines() throws Exception {
        File tmpFile = new File("src/test/resources/pollstations.csv");
        List<PeripheralCommittee> result = null;
        result = csvParser.parse(tmpFile);

        Assert.assertEquals(result.size(), 2);

        PeripheralCommittee firstLine = result.get(0);
        Assert.assertEquals(firstLine.getTerritorialCode(), "=\"020101\"");
        // Assert.assertEquals(firstLine.getTerritoryCode().longValue(), 20101L);

        PeripheralCommittee secondLine = result.get(1);
        // Assert.assertEquals(secondLine.getTerritoryCode().longValue(), 20101L);
        Assert.assertEquals(secondLine.getPeripheralCode(), "2");
        Assert.assertEquals(secondLine.getTerritorialCode(), "=\"020101\"");
        Assert.assertEquals(secondLine.getType(), "gmina miejska");
        Assert.assertEquals(secondLine.getName(), "Szkoła Podstawowa Nr 3");
//        Assert.assertEquals(secondLine.getAddress(), "Szkoła Podstawowa Nr 3, ul. Ceramiczna 5, 59-700 Bolesławiec");
        Assert.assertEquals(secondLine.getAllowedToVote().longValue(), 1406);
    }

    @Test
    public void notNumberAllowedToVoteMapsToZero() throws Exception {
        File tmpFile = new File("src/test/resources/pollstations-unknown-allowed-to-vote.csv");
        List<PeripheralCommittee> result = csvParser.parse(tmpFile);
        Assert.assertEquals(result.get(0).getAllowedToVote().longValue(), 0);
    }

    @Test
    public void treatQuotationMarksAsText() throws Exception {
        File tmpFile = new File("src/test/resources/pollstations-quotes.csv");
        List<PeripheralCommittee> result = csvParser.parse(tmpFile);
        Assert.assertEquals(result.get(0).getName(), "Muzeum Miejskie \"Saturn");
    }

    @Test(expectedExceptions = {FileNotFoundException.class})
    public void shouldThrowExceptionWhenFileNotFound() throws Exception {
        File tmpFile = new File("unknown");
        csvParser.parse(tmpFile);
    }
}
