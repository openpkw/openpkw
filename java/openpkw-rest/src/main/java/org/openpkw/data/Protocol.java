package org.openpkw.data;

import java.util.List;

/**
 * Created by tbiernat on 2015-08-27.
 */
public class Protocol {

    private String peripherialComitteeName;
    private String teritorialCode;
    private String handedOverCards;
    private List<Question> questionsList;

    public String getPeripherialComitteeName() {
        return peripherialComitteeName;
    }

    public void setPeripherialComitteeName(String peripherialComitteeName) {
        this.peripherialComitteeName = peripherialComitteeName;
    }

    public String getTeritorialCode() {
        return teritorialCode;
    }

    public void setTeritorialCode(String teritorialCode) {
        this.teritorialCode = teritorialCode;
    }

    public String getHandedOverCards() {
        return handedOverCards;
    }

    public void setHandedOverCards(String handedOverCards) {
        this.handedOverCards = handedOverCards;
    }

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Question> questionsList) {
        this.questionsList = questionsList;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
