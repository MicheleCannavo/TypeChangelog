package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestRemovedLog {
    AbstractTypeChagelog removed;

    @Before
    public void setUp() {
        removed = new RemovedLog();
    }

    @Test
    public void getSymbolType() {

        assertEquals("**-**", removed.getSymbolType());
    }

    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");
        removed.setListaItems(lista);

        assertEquals(lista.get(0), removed.getListaItems().get(0));
        assertEquals(lista.get(1), removed.getListaItems().get(1));
    }

    @Test
    public void add() {
        String s = "item";
        removed.add(s);
        assertEquals(s, removed.getListaItems().get(0));
    }

    @Test
    public void getFormatCompactList() {

        removed.add("primo");
        removed.add("secondo");

        String s =
            "**-** primo"   + System.lineSeparator() +
            "**-** secondo" + System.lineSeparator();

        assertEquals(s, removed.getFormatCompactList());
    }

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
}