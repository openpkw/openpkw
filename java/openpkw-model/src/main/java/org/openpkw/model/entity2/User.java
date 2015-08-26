package org.openpkw.model.entity2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Karol Dzięgiel on 8/26/2015.
 */
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "USER_ID")
    private Integer id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "is_Active")
    private Boolean isActive;

    @Column(name = "token")
    private String token;

    @Column(name = "token_created_date")
    private Date tokenCreatedDate;

    //TODO UserType, getters and setters
}

