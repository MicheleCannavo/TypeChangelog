package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

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
    public void add() {
        String s = "item";
        fixed.add(s);
        assertEquals(s, fixed.getListaAdd().get(0));
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