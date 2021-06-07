package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestDeprecatedLog {
    AbstractTypeChagelog deprecated;

    @Before
    public void setUp() {
        deprecated = new DeprecatedLog();
    }

    @Test
    public void getSymbolType() {

        assertEquals("**§**", deprecated.getSymbolType());
    }

    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        deprecated.setListaItems(lista);

        assertEquals(lista.get(0), deprecated.getListaItems().get(0));
        assertEquals(lista.get(1), deprecated.getListaItems().get(1));
    }

    @Test
    public void add() {
        String s = "item";
        deprecated.add(s);
        assertEquals(s, deprecated.getListaItems().get(0));
    }

    @Test
    public void getFormatCompactList() {

        deprecated.add("primo");
        deprecated.add("secondo");

        String s =
            "**§** primo"   + System.lineSeparator() +
            "**§** secondo" + System.lineSeparator();

        assertEquals(s, deprecated.getFormatCompactList());
    }

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
}