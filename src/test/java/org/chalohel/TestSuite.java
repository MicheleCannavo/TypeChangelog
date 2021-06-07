package org.chalohel;

import org.chalohel.typechangelog.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    TestAddedLog.class,     TestSecurityLog.class,
    TestChangedLog.class,   TestRemovedLog.class,
    TestFixedLog.class,     TestDeprecatedLog.class,
    TestUnreleasedLog.class,
})

public class TestSuite {
}