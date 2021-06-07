package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Test changed log.
 */
public class TestChangedLog {
    /**
     * The Change.
     */
    AbstractTypeChagelog change;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        change = new ChangedLog();
    }

    /**
     * Gets symbol type.
     */
    @Test
    public void getSymbolType() {

        assertEquals("**~**", change.getSymbolType());
    }

    /**
     * Sets lista items.
     */
    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        change.setListaItems(lista);

        assertEquals(lista.get(0), change.getListaItems().get(0));
        assertEquals(lista.get(1), change.getListaItems().get(1));
    }

    /**
     * Add.
     */
    @Test
    public void add() {
        String s = "item";
        change.add(s);
        assertEquals(s, change.getListaItems().get(0));
    }

    /**
     * Gets format compact list.
     */
    @Test
    public void getFormatCompactList() {

        change.add("primo");
        change.add("secondo");

        String s =
            "**~** primo"   + System.lineSeparator() +
            "**~** secondo" + System.lineSeparator();

        assertEquals(s, change.getFormatCompactList());
    }

    /**
     * Gets format normal list if list is empty.
     */
    @Test
    public void getFormatNormalListIfListIsEmpty() {
        assertEquals("", change.getFormatNormalList());
    }
    /**
     * Gets format normal list.
     */
    @Test
    public void getFormatNormalList() {

        change.add("primo");
        change.add("secondo");

        String s =
            "**CHANGED**" + System.lineSeparator() +
                "- primo"   + System.lineSeparator() +
                "- secondo" + System.lineSeparator();

        assertEquals(s,change.getFormatNormalList());
    }
}