package org.chalohel.typechangelog;

import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe gestisce il tipo YANKED.
 * <p>
 * Esso contiene tutte le future potenziali aggiunte di funzionalità nel software. non sono legati a nessuna versione
 * Nello specifico i quanto la nuova funzione può essere solo sheludata anche in futuro prossimo e non nell'immediato.
 */
public class UnreleasedLog {

    /**
     * Lista di voci per il tipo unrelease.
     */
    private List<String> items;

    /**
     *
     * @return l'item attuale.
     */
    public List<String> getItems() {
        return items;
    }


    /**
     * Instantiates a new Yanked log.
     */
    public UnreleasedLog() {
        items = new ArrayList<>();
    }

    /**
     *
     * @param item aggiunge l'item adlla lista interna.
     */
    public void addItem(String item) {
        items.add(item);
    }

    /**
     * Unrelease log string.
     *
     * @return the string
     */
    public String getUnreleased() {
        StringBuilder str = new StringBuilder();
        str.append("## UNRELEASED")
            .append(System.lineSeparator().repeat(2));

        for (String s : items) {
            str.append(s).append(System.lineSeparator());
        }

        return str.append(System.lineSeparator()).toString();
    }
}
