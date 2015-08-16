package org.openpkw.services;


import org.openpkw.exceptions.CryptographyException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Karol Dziegiel on 8/13/2015.
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
    public void testDigestPasswordNotEquals() {
        String encryptedSentence = "d1217aeeb182c9106254d397ba743802c26d6afe";
        //encryptedSentence is "alamakota"
        String sentence = "alaniemakota";
        String testedResult = null;
        try {
            testedResult = cryptographyService.digestPassword(sentence);
        } catch (CryptographyException e) {
        }
        Assert.assertNotEquals(encryptedSentence, testedResult);
    }

    @Test
    public void testIsPasswordCorrectTrue() {
        String passwordExample = "alamakota";
        String hashedPasswordExample = "d1217aeeb182c9106254d397ba743802c26d6afe";
        boolean doesPasswordMatchHash = false;
        doesPasswordMatchHash = cryptographyService.isPasswordCorrect(passwordExample, hashedPasswordExample);
        Assert.assertTrue(doesPasswordMatchHash);
    }

    @Test
    public void testIsPasswordCorrectWrongPassword() {
        String passwordExample = "alaniemakota";
        String hashedPassword = "d1217aeeb182c9106254d397ba743802c26d6afe";
        boolean doesPasswordMatch = true;
        doesPasswordMatch = cryptographyService.isPasswordCorrect(passwordExample, hashedPassword);
        Assert.assertFalse(doesPasswordMatch);
    }

    @Test
    public void testIsPasswordCorrectHash() {
        String passwordExample = "alamakota";
        String hashedPassword = "d1217aeeb182c9106254d397ba743802c26d6aff";
        boolean doesPasswordMatch = true;
        doesPasswordMatch = cryptographyService.isPasswordCorrect(passwordExample, hashedPassword);
        Assert.assertFalse(doesPasswordMatch);
    }

}
