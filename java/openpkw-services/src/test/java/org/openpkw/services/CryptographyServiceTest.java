package org.openpkw.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.openpkw.exceptions.CryptographyException;

/**
 * Created by kdziegie on 8/13/2015.
 */
public class CryptographyServiceTest {

    @Mock
    private CryptographyService cryptographyService;

    @Before
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


}
