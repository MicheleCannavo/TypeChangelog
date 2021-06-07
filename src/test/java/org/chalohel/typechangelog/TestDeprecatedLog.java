package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Test deprecated log.
 */
public class TestDeprecatedLog {
    /**
     * The Deprecated.
     */
    AbstractTypeChagelog deprecated;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        deprecated = new DeprecatedLog();
    }

    /**
     * Gets symbol type.
     */
    @Test
    public void getSymbolType() {

        assertEquals("**§**", deprecated.getSymbolType());
    }

    /**
     * Sets lista items.
     */
    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        deprecated.setListaItems(lista);

        assertEquals(lista.get(0), deprecated.getListaItems().get(0));
        assertEquals(lista.get(1), deprecated.getListaItems().get(1));
    }

    /**
     * Add.
     */
    @Test
    public void add() {
        String s = "item";
        deprecated.add(s);
        assertEquals(s, deprecated.getListaItems().get(0));
    }

    /**
     * Gets format compact list.
     */
    @Test
    public void getFormatCompactList() {

        deprecated.add("primo");
        deprecated.add("secondo");

        String s =
            "**§** primo"   + System.lineSeparator() +
            "**§** secondo" + System.lineSeparator();

        assertEquals(s, deprecated.getFormatCompactList());
    }

    /**
     * Gets format normal list.
     */
    @Test
    public void getFormatNormalList() {

        deprecated.add("primo");
        deprecated.add("secondo");

        String s =
            "**DEPRECATED**" + System.lineSeparator() +
                "- primo"   + System.lineSeparator() +
                "- secondo" + System.lineSeparator();

        assertEquals(s, deprecated.getFormatNormalList());
    }
    /**
     * Gets format normal list if list is empty.
     */
    @Test
    public void getFormatNormalListIfListIsEmpty() {
        assertEquals("", deprecated.getFormatNormalList());
    }
}