package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestAddedLog {
    AbstractTypeChagelog add;

    @Before
    public void setUp() {
         add = new AddedLog();
    }

    @Test
    public void getSymbolType() {

        assertEquals("**+**", add.getSymbolType());
    }

    @Test
    public void setListaItems() {
        List<String> lista = new ArrayList<>();
        lista.add("Item1");
        lista.add("Item2");

        add.setListaItems(lista);

        assertEquals(lista.get(0), add.getListaItems().get(0));
        assertEquals(lista.get(1), add.getListaItems().get(1));

    }

    @Test
    public void add() {
        String s = "item";
        add.add(s);
        assertEquals(s, add.getListaItems().get(0));
    }

    @Test
    public void getFormatCompactList() {

        add.add("primo");
        add.add("secondo");

        String s =
            "**+** primo"   + System.lineSeparator() +
            "**+** secondo" + System.lineSeparator();

        assertEquals(s, add.getFormatCompactList());
    }

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

    @Test
    public void getFormatNormalListIfListIsEmpty() {
        System.out.println("dim lista" + add.getListaItems().size());
        assertEquals("", add.getFormatNormalList());
    }
}