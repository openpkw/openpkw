package org.openpkw.model.entity2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Karol Dzięgiel on 8/27/2015.
 */
@Entity
@Table(name = "question")
public class Question {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "question_id")
    private Integer questionID;

    @Column(name = "content")
    private String content;

    @Column(name = "yes_answers_amount")
    private Integer yesAnswersAmount;

    @Column(name = "no_answers_amount")
    private Integer noAnswersAmount;

    @Column(name = "invalid_answers_amount")
    private Integer invalidAnswersAmount;

    @Column(name = "valid_answers")
    private Integer validAnswersAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "protocol_id")
    Protocol protocol;

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getYesAnswersAmount() {
        return yesAnswersAmount;
    }

    public void setYesAnswersAmount(Integer yesAnswersAmount) {
        this.yesAnswersAmount = yesAnswersAmount;
    }

    public Integer getNoAnswersAmount() {
        return noAnswersAmount;
    }

    public void setNoAnswersAmount(Integer noAnswersAmount) {
        this.noAnswersAmount = noAnswersAmount;
    }

    public Integer getInvalidAnswersAmount() {
        return invalidAnswersAmount;
    }

    public void setInvalidAnswersAmount(Integer invalidAnswersAmount) {
        this.invalidAnswersAmount = invalidAnswersAmount;
    }

    public Integer getValidAnswersAmount() {
        return validAnswersAmount;
    }

    public void setValidAnswersAmount(Integer validAnswersAmount) {
        this.validAnswersAmount = validAnswersAmount;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
}
