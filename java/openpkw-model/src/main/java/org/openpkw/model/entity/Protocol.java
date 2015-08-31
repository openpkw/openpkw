package org.openpkw.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by Karol Dzięgiel on 8/27/2015.
 */
@Entity
@Table(name = "protocol")
public class Protocol {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "protocol_id")
    private Long protocolID;

    @Column(name = "name")
    private String name;

    @Column(name = "cards_given")
    private Long cardsGiven;

    @Column(name = "received_date")
    private Date receivedDate;

    @OneToOne
    @JoinColumn(name = "peripheral_committee_id")
    private PeripheralCommittee peripheralCommittee;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "protocol_id")
    private List<Photo> photos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "protocol_id")
    private List<Question> questions;

    public Long getProtocolID() {
        return protocolID;
    }

    public void setProtocolID(Long protocolID) {
        this.protocolID = protocolID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCardsGiven() {
        return cardsGiven;
    }

    public void setCardsGiven(Long cardsGiven) {
        this.cardsGiven = cardsGiven;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public PeripheralCommittee getPeripheralCommittee() {
        return peripheralCommittee;
    }

    public void setPeripheralCommittee(PeripheralCommittee peripheralCommittee) {
        this.peripheralCommittee = peripheralCommittee;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
