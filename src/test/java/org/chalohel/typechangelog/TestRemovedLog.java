package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Test removed log.
 */
public class TestRemovedLog {
    /**
     * The Removed.
     */
    AbstractTypeChagelog removed;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        removed = new RemovedLog();
    }

    /**
     * Gets symbol type.
     */
    @Test
    public void getSymbolType() {

        assertEquals("**-**", removed.getSymbolType());
    }

    /**
     * Sets lista items.
     */
    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        removed.setListaItems(lista);

        assertEquals(lista.get(0), removed.getListaItems().get(0));
        assertEquals(lista.get(1), removed.getListaItems().get(1));
    }

    /**
     * Add.
     */
    @Test
    public void add() {
        String s = "item";
        removed.add(s);
        assertEquals(s, removed.getListaItems().get(0));
    }

    /**
     * Gets format compact list.
     */
    @Test
    public void getFormatCompactList() {

        removed.add("primo");
        removed.add("secondo");

        String s =
            "**-** primo"   + System.lineSeparator() +
            "**-** secondo" + System.lineSeparator();

        assertEquals(s, removed.getFormatCompactList());
    }

    /**
     * Gets format normal list.
     */
    @Test
    public void getFormatNormalList() {

        removed.add("primo");
        removed.add("secondo");

        String s =
            "**REMOVED**" + System.lineSeparator() +
                "- primo"   + System.lineSeparator() +
                "- secondo" + System.lineSeparator();

        assertEquals(s, removed.getFormatNormalList());
    }

    /**
     * Gets format normal list if list is empty.
     */
    @Test
    public void getFormatNormalListIfListIsEmpty() {
        assertEquals("", removed.getFormatNormalList());
    }
}