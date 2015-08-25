package org.openpkw.services;

import org.openpkw.exceptions.CryptographyException;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Created by Karol Dziegiel on 8/13/2015.
 * Class with methods to hash (digest) given password and to check if the given password matches with hash
 */
@Service
public class CryptographyService {

    private final String HASHING_ALGHORITM = "SHA1";

    /**
     * Creates hash out of given password
     *
     * @param password password given for encrypting
     * @return returns hash of the given password
     * @throws CryptographyException
     */
    public String digestPassword(String password) throws CryptographyException {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance(HASHING_ALGHORITM);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptographyException("Encryption failed", e);
        }
        byte[] encryptedPassword = messageDigest.digest(password.getBytes());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < encryptedPassword.length; i++) {
            sb.append(Integer.toString((encryptedPassword[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();

    }

    /**
     * Checks if given password matches given hash
     *
     * @param password password given to check with the given hash
     * @param hash     given to check it the password matches it
     * @return true value if the password matches the hash
     * @throws CryptographyException
     */
    public boolean isPasswordCorrect(String password, String hash) throws CryptographyException {
        String hashedPassword = digestPassword(password);

        if (hashedPassword != null)
            if (hashedPassword.equals(hash)) return true;
        return false;
    }

}
