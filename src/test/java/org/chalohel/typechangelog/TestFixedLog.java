package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Test fixed log.
 */
public class TestFixedLog {
    /**
     * The Fixed.
     */
    AbstractTypeChagelog fixed;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        fixed = new FixedLog();
    }

    /**
     * Gets symbol type.
     */
    @Test
    public void getSymbolType() {

        assertEquals("**#**", fixed.getSymbolType());
    }

    /**
     * Sets lista items.
     */
    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        fixed.setListaItems(lista);

        assertEquals(lista.get(0), fixed.getListaItems().get(0));
        assertEquals(lista.get(1), fixed.getListaItems().get(1));
    }

    /**
     * Add.
     */
    @Test
    public void add() {
        String s = "item";
        fixed.add(s);
        assertEquals(s, fixed.getListaItems().get(0));
    }

    /**
     * Gets format compact list.
     */
    @Test
    public void getFormatCompactList() {

        fixed.add("primo");
        fixed.add("secondo");

        String s =
            "**#** primo"   + System.lineSeparator() +
                "**#** secondo" + System.lineSeparator();

        assertEquals(s, fixed.getFormatCompactList());
    }

    /**
     * Gets format normal list.
     */
    @Test
    public void getFormatNormalList() {

        fixed.add("primo");
        fixed.add("secondo");

        String s =
            "**FIXED**" + System.lineSeparator() +
                "- primo"   + System.lineSeparator() +
                "- secondo" + System.lineSeparator();

        assertEquals(s, fixed.getFormatNormalList());
    }

    /**
     * Gets format normal list if list is empty.
     */
    @Test
    public void getFormatNormalListIfListIsEmpty() {
        assertEquals("", fixed.getFormatNormalList());
    }
}