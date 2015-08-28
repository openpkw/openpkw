package org.openpkw.transform;

import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;

/**
 * Created by wojciech.szostak on 17.08.2015.
 */
public class PeripherialCommitteeTokenizer extends DelimitedLineTokenizer {
    public PeripherialCommitteeTokenizer() {
        String[] names = {
                "teryt-gminy", "gmina", "numer-obwodu", "liczba-mieszkancow",
                "liczba-wyborcow", "liczba-wyslanych-pakietow-wyborczych",
                "liczba-pelnomocnictw-do-glosowania", "siedziba", "ulica",
                "numer-posesji", "numer-lokalu", "miejscowosc", "kraj",
                "kod-pocztowy", "poczta", "dla-niepelnosprawnych",
                "korespondencyjny", "granice", "typ-obszaru", "typ-obwodu",
                "tajny", "pelna-siedziba"
        };

        this.setDelimiter(";");
        this.setQuoteCharacter('"');
        this.setNames(names);
    }
}
