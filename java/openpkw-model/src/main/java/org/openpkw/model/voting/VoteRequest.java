package org.openpkw.model.voting;

import java.io.Serializable;

/**
 * Created by tola on 2015-07-22.
 */
public class VoteRequest implements Serializable {

    private Vote vote;

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }
}
