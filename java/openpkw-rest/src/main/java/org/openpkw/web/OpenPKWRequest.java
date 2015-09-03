package org.openpkw.web;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.util.MultiValueMap;

import java.io.Serializable;
import java.net.URI;

/**
 * Created by tola on 2015-09-02.
 */
public class OpenPKWRequest<T> extends RequestEntity<T> implements Serializable {

    public OpenPKWRequest(HttpMethod method, URI url) {
        super(method, url);
    }

    public OpenPKWRequest(T body, HttpMethod method, URI url) {
        super(body, method, url);
    }

    public OpenPKWRequest(MultiValueMap<String, String> headers, HttpMethod method, URI url) {
        super(headers, method, url);
    }

    public OpenPKWRequest(T body, MultiValueMap<String, String> headers, HttpMethod method, URI url) {
        super(body, headers, method, url);
    }
}
