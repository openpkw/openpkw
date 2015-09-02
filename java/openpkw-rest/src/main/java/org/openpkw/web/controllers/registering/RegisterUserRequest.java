package org.openpkw.web.controllers.registering;

import org.openpkw.model.entity.User;
import org.openpkw.web.OpenPKWRequest;

/**
 * Created by tola on 2015-09-02.
 */
public class RegisterUserRequest extends OpenPKWRequest {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
