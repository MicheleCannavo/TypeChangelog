package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestFixedLog {
    AbstractTypeChagelog fixed;

    @Before
    public void setUp() {
        fixed = new FixedLog();
    }

    @Test
    public void getSymbolType() {

        assertEquals("**#**", fixed.getSymbolType());
    }

    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        fixed.setListaItems(lista);

        assertEquals(lista.get(0), fixed.getListaItems().get(0));
        assertEquals(lista.get(1), fixed.getListaItems().get(1));
    }

    @Test
    public void add() {
        String s = "item";
        fixed.add(s);
        assertEquals(s, fixed.getListaItems().get(0));
    }

    @Test
    public void getFormatCompactList() {

        fixed.add("primo");
        fixed.add("secondo");

        String s =
            "**#** primo"   + System.lineSeparator() +
                "**#** secondo" + System.lineSeparator();

        assertEquals(s, fixed.getFormatCompactList());
    }

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
}