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
    private Long questionID;

    @Column(name = "content")
    private String content;

    @Column(name = "yes_answers_amount")
    private Long yesAnswersAmount;

    @Column(name = "no_answers_amount")
    private Long noAnswersAmount;

    @Column(name = "invalid_answers_amount")
    private Long invalidAnswersAmount;

    @Column(name = "valid_answers")
    private Long validAnswersAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "protocol_id")
    Protocol protocol;

    public Long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Long questionID) {
        this.questionID = questionID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getYesAnswersAmount() {
        return yesAnswersAmount;
    }

    public void setYesAnswersAmount(Long yesAnswersAmount) {
        this.yesAnswersAmount = yesAnswersAmount;
    }

    public Long getNoAnswersAmount() {
        return noAnswersAmount;
    }

    public void setNoAnswersAmount(Long noAnswersAmount) {
        this.noAnswersAmount = noAnswersAmount;
    }

    public Long getInvalidAnswersAmount() {
        return invalidAnswersAmount;
    }

    public void setInvalidAnswersAmount(Long invalidAnswersAmount) {
        this.invalidAnswersAmount = invalidAnswersAmount;
    }

    public Long getValidAnswersAmount() {
        return validAnswersAmount;
    }

    public void setValidAnswersAmount(Long validAnswersAmount) {
        this.validAnswersAmount = validAnswersAmount;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
}
