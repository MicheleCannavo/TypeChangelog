package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

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
    public void add() {
        String s = "item";
        deprecated.add(s);
        assertEquals(s, deprecated.getListaAdd().get(0));
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