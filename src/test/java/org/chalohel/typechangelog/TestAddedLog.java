package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

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
    public void add() {
        String s = "item";
        add.add(s);
        assertEquals(s, add.getListaAdd().get(0));
    }

    public void setAdd(AbstractTypeChagelog add) {
        this.add = add;
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

        assertEquals(s,add.getFormatNormalList());
    }
}