package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Test added log.
 */
public class TestAddedLog {
    /**
     * The Add.
     */
    AbstractTypeChagelog add;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
         add = new AddedLog();
    }

    /**
     * Gets symbol type.
     */
    @Test
    public void getSymbolType() {

        assertEquals("**+**", add.getSymbolType());
    }

    /**
     * Sets lista items.
     */
    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");

        add.setListaItems(lista);

        assertEquals(lista.get(0), add.getListaItems().get(0));
        assertEquals(lista.get(1), add.getListaItems().get(1));

    }

    /**
     * Add.
     */
    @Test
    public void add() {
        String s = "item";
        add.add(s);
        assertEquals(s, add.getListaItems().get(0));
    }

    /**
     * Gets format compact list.
     */
    @Test
    public void getFormatCompactList() {

        add.add("primo");
        add.add("secondo");

        String s =
            "**+** primo"   + System.lineSeparator() +
            "**+** secondo" + System.lineSeparator();

        assertEquals(s, add.getFormatCompactList());
    }

    /**
     * Gets format normal list.
     */
    @Test
    public void getFormatNormalList() {

        add.add("primo");
        add.add("secondo");

        String s =
            "**ADDED**" + System.lineSeparator() +
            "- primo"   + System.lineSeparator() +
            "- secondo" + System.lineSeparator();

        assertEquals(s, add.getFormatNormalList());
    }

    /**
     * Gets format normal list if list is empty.
     */
    @Test
    public void getFormatNormalListIfListIsEmpty() {
        assertEquals("", add.getFormatNormalList());
    }
}