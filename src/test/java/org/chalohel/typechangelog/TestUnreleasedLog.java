package org.chalohel.typechangelog;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The type Test unreleased log.
 */
public class TestUnreleasedLog {
    /**
     * The Unrelease.
     */
    UnreleasedLog unrelease;
    /**
     * The P.
     */
    String p = "primo";
    /**
     * The S.
     */
    String s = "secondo";

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        unrelease = new UnreleasedLog();
        unrelease.addItem(p);
        unrelease.addItem(s);
    }

    /**
     * Test size add unreleased items.
     */
    @Test
    public void TestSizeAddUnreleasedItems() {
        assertEquals(2, unrelease.getItems().size());
    }

    /**
     * Test add unreleased items.
     */
    @Test
    public void TestAddUnreleasedItems() {
        assertEquals(p, unrelease.getItems().get(0) );
        assertEquals(s, unrelease.getItems().get(1) );
    }

    /**
     * Gets unreleased.
     */
    @Test
    public void getUnreleased() {

       String str = "## UNRELEASED" +
           System.lineSeparator().repeat(2) +
        p+System.lineSeparator() +
        s+System.lineSeparator().repeat(2);

       assertEquals(str, unrelease.getUnreleased());

    }
}