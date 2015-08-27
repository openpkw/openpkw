package org.openpkw.data;

/**
 * Created by tbiernat on 2015-08-27.
 */
public class Question {
    private String questionContent;
    private String validVotesAmount;
    private String invalidVotesAmount;
    private String yesAnswersAmount;
    private String noAnswersAmount;

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getValidVotesAmount() {
        return validVotesAmount;
    }

    public void setValidVotesAmount(String validVotesAmount) {
        this.validVotesAmount = validVotesAmount;
    }

    public String getInvalidVotesAmount() {
        return invalidVotesAmount;
    }

    public void setInvalidVotesAmount(String invalidVotesAmount) {
        this.invalidVotesAmount = invalidVotesAmount;
    }

    public String getYesAnswersAmount() {
        return yesAnswersAmount;
    }

    public void setYesAnswersAmount(String yesAnswersAmount) {
        this.yesAnswersAmount = yesAnswersAmount;
    }

    public String getNoAnswersAmount() {
        return noAnswersAmount;
    }

    public void setNoAnswersAmount(String noAnswersAmount) {
        this.noAnswersAmount = noAnswersAmount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
