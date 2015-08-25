package org.openpkw.model.dto;

import java.util.Date;

/**
 * Created by Karol Dzięgiel on 8/21/2015.
 * POJO file used as middle layer between REST Service and Entity from DataBase.
 * This file could be converted to JSON as a form of transfer of data
 */
public class ResultDTO {
    private Date timestampt;
    private Integer answerOneYesPercentage;
    private Integer answerTwoYesPercentage;
    private Integer answerThreeYesPercentage;
    private Integer turnoutPercentage;
    private Integer countedCommitteesPercentage;

    public ResultDTO(Integer answerOneYesPercentage, Integer answerTwoYesPercentage, Integer answerThreeYesPercentage, Integer turnoutPercentage, Integer countedCommitteesPercentage) {
        this.answerOneYesPercentage = answerOneYesPercentage;
        this.answerTwoYesPercentage = answerTwoYesPercentage;
        this.answerThreeYesPercentage = answerThreeYesPercentage;
        this.turnoutPercentage = turnoutPercentage;
        this.countedCommitteesPercentage = countedCommitteesPercentage;
        this.timestampt = new Date(); //timestamp of generation time of this particular DTO
    }


    public Date getTimestampt() {
        return timestampt;
    }

    public void setTimestampt(Date timestampt) {
        this.timestampt = timestampt;
    }

    public Integer getAnswerOneYesPercentage() {
        return answerOneYesPercentage;
    }

    public void setAnswerOneYesPercentage(Integer answerOneYesPercentage) {
        this.answerOneYesPercentage = answerOneYesPercentage;
    }

    public Integer getAnswerTwoYesPercentage() {
        return answerTwoYesPercentage;
    }

    public void setAnswerTwoYesPercentage(Integer answerTwoYesPercentage) {
        this.answerTwoYesPercentage = answerTwoYesPercentage;
    }

    public Integer getAnswerThreeYesPercentage() {
        return answerThreeYesPercentage;
    }

    public void setAnswerThreeYesPercentage(Integer answerThreeYesPercentage) {
        this.answerThreeYesPercentage = answerThreeYesPercentage;
    }

    public Integer getTurnoutPercentage() {
        return turnoutPercentage;
    }

    public void setTurnoutPercentage(Integer turnoutPercentage) {
        this.turnoutPercentage = turnoutPercentage;
    }

    public Integer getCountedCommitteesPercentage() {
        return countedCommitteesPercentage;
    }

    public void setCountedCommitteesPercentage(Integer countedCommitteesPercentage) {
        this.countedCommitteesPercentage = countedCommitteesPercentage;
    }
}
