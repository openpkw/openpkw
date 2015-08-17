package org.openpkw.transform;

import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;

/**
 * Created by wojciech.szostak on 17.08.2015.
 */
public class PeripherialCommitteeTokenizer extends DelimitedLineTokenizer {
    public PeripherialCommitteeTokenizer() {
        this.setDelimiter("|");
        this.setQuoteCharacter('\'');
    }
}
