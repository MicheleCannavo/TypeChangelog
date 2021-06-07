package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Test security log.
 */
public class TestSecurityLog {
    /**
     * The Security.
     */
    AbstractTypeChagelog security;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        security = new SecurityLog();
    }

    /**
     * Gets symbol type.
     */
    @Test
    public void getSymbolType() {

        assertEquals("**$**", security.getSymbolType());
    }

    /**
     * Sets lista items.
     */
    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        security.setListaItems(lista);

        assertEquals(lista.get(0), security.getListaItems().get(0));
        assertEquals(lista.get(1), security.getListaItems().get(1));
    }

    /**
     * Add.
     */
    @Test
    public void add() {
        String s = "item";
        security.add(s);
        assertEquals(s, security.getListaItems().get(0));
    }

    /**
     * Gets format compact list.
     */
    @Test
    public void getFormatCompactList() {

        security.add("primo");
        security.add("secondo");

        String s =
            "**$** primo"   + System.lineSeparator() +
            "**$** secondo" + System.lineSeparator();

        assertEquals(s, security.getFormatCompactList());
    }

    /**
     * Gets format normal list.
     */
    @Test
    public void getFormatNormalList() {

        security.add("primo");
        security.add("secondo");

        String s =
            "**SECURITY**" + System.lineSeparator() +
                "- primo"   + System.lineSeparator() +
                "- secondo" + System.lineSeparator();

        assertEquals(s, security.getFormatNormalList());
    }

    /**
     * Gets format normal list if list is empty.
     */
    @Test
    public void getFormatNormalListIfListIsEmpty() {
        assertEquals("", security.getFormatNormalList());
    }
}