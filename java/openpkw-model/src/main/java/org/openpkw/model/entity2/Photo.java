package org.openpkw.model.entity2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Karol Dzięgiel on 8/27/2015.
 */
@Entity
@Table(name = "photo")
public class Photo {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "photo_id")
    private Long id;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "user_id")
    private Long userID;

    @Column(name = "user_file_name")
    private String userFileName;

    @Column(name = "token")
    private String token;

    @Column(name = "filetype")
    private String filetype;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "protocol_id")
    private Protocol protocol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserFileName() {
        return userFileName;
    }

    public void setUserFileName(String userFileName) {
        this.userFileName = userFileName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
}
