package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUnreleasedLog {
    UnreleasedLog unrelease;
    String p = "primo";
    String s = "secondo";

    @Before
    public void setUp() {
        unrelease = new UnreleasedLog();
        unrelease.addItem(p);
        unrelease.addItem(s);
    }

    @Test
    public void TestSizeAddUnreleasedItems() {
        assertEquals(2, unrelease.getItems().size());
    }

    @Test
    public void TestAddUnreleasedItems() {
        assertEquals(p, unrelease.getItems().get(0) );
        assertEquals(s, unrelease.getItems().get(1) );
    }

    @Test
    public void getUnreleased() {

       String str = "## UNRELEASED" +
           System.lineSeparator().repeat(2) +
        p+System.lineSeparator() +
        s+System.lineSeparator().repeat(2);

       assertEquals(str, unrelease.getUnreleased());

    }
}