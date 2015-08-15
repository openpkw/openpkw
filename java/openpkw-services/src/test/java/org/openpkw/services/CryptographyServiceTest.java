package org.openpkw.services;


import org.openpkw.exceptions.CryptographyException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by kdziegie on 8/13/2015.
 */
public class CryptographyServiceTest {

    private CryptographyService cryptographyService;

    @BeforeClass
    public void init() {
        cryptographyService = new CryptographyService();
    }

    @Test
    public void testDigestPasswordEquals() {
        String encryptedSentence = "d1217aeeb182c9106254d397ba743802c26d6afe";
        String sentence = "alamakota";
        String testedResult = null;
        try {
            testedResult = cryptographyService.digestPassword(sentence);
        } catch (CryptographyException e) {
        }
        Assert.assertEquals(encryptedSentence, testedResult);
    }

    @Test
    public void testDigestPasswordNotEquals(){
        String encryptedSentence = "d1217aeeb182c9106254d397ba743802c26d6afe";
        //encryptedSentence is "alamakota"
        String sentence = "alaniemakota";
        String testedResult = null;
        try{
            testedResult = cryptographyService.digestPassword(sentence);
        } catch (CryptographyException e){
        }
        Assert.assertNotEquals(encryptedSentence, testedResult);
    }


}
