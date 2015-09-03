package org.openpkw.web.controllers.registering;

import org.openpkw.model.entity.User;
import org.openpkw.web.OpenPKWRequest;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;

import java.net.URI;

/**
 * Created by tola on 2015-09-02.
 */
public class RegisterUserRequest extends OpenPKWRequest {

    private User user;

    public RegisterUserRequest(HttpMethod method, URI url) {
        super(method, url);
    }

    public RegisterUserRequest(Object body, HttpMethod method, URI url) {
        super(body, method, url);
    }

    public RegisterUserRequest(MultiValueMap headers, HttpMethod method, URI url) {
        super(headers, method, url);
    }

    public RegisterUserRequest(Object body, MultiValueMap headers, HttpMethod method, URI url) {
        super(body, headers, method, url);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
