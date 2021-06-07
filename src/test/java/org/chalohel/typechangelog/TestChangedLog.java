package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestChangedLog {
    AbstractTypeChagelog change;

    @Before
    public void setUp() {
        change = new ChangedLog();
    }

    @Test
    public void getSymbolType() {

        assertEquals("**~**", change.getSymbolType());
    }

    @Test
    public void add() {
        String s = "item";
        change.add(s);
        assertEquals(s, change.getListaAdd().get(0));
    }

    @Test
    public void getFormatCompactList() {

        change.add("primo");
        change.add("secondo");

        String s =
            "**~** primo"   + System.lineSeparator() +
            "**~** secondo" + System.lineSeparator();

        assertEquals(s, change.getFormatCompactList());
    }

    @Test
    public void getFormatNormalList() {

        change.add("primo");
        change.add("secondo");

        String s =
            "**CHANGED**" + System.lineSeparator() +
                "- primo"   + System.lineSeparator() +
                "- secondo" + System.lineSeparator();

        assertEquals(s,change.getFormatNormalList());
    }
}