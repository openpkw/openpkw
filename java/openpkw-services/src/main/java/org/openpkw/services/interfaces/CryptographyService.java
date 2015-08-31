package org.openpkw.services.interfaces;

import org.openpkw.exceptions.CryptographyException;

/**
 * Created by Karol Dziegiel on 31.08.15.
 */
public interface CryptographyService {
    String digestPassword(String password) throws CryptographyException;

    boolean isPasswordCorrect(String password, String hash) throws CryptographyException;
}
