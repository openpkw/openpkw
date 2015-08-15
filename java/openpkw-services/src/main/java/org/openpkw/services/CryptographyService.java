package org.openpkw.services;

import org.openpkw.exceptions.CryptographyException;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Created by kdziegie on 8/13/2015.
 */
@Service
public class CryptographyService {

    private final String HASHING_ALGHORITM = "SHA1";


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

    public boolean isPasswordCorrect(String password, String hash) {
        String hashedPassword = null;
        try {
            hashedPassword = digestPassword(password);

        } catch (CryptographyException e) {
            //sth to do?
        }
        if (hashedPassword != null) {
            if (hashedPassword.equals(hash)) return true;
            else return false;
        } else return false;
    }

}
