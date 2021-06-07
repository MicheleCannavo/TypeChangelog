package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSecurityLog {
    AbstractTypeChagelog security;

    @Before
    public void setUp() {
        security = new SecurityLog();
    }

    @Test
    public void getSymbolType() {

        assertEquals("**$**", security.getSymbolType());
    }

    @Test
    public void add() {
        String s = "item";
        security.add(s);
        assertEquals(s, security.getListaAdd().get(0));
    }

    @Test
    public void getFormatCompactList() {

        security.add("primo");
        security.add("secondo");

        String s =
            "**$** primo"   + System.lineSeparator() +
            "**$** secondo" + System.lineSeparator();

        assertEquals(s, security.getFormatCompactList());
    }

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
}