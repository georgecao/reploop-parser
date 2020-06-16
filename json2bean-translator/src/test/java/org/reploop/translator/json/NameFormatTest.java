package org.reploop.translator.json;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameFormatTest {
    NameFormat format;

    @Before
    public void setUp() throws Exception {
        format = new NameFormat();
    }

    @Test
    public void testFormat() {
        String id = "UTF8AsTest";
        String f = format.format(id);
        assertEquals("utf8_as_test", f);

        id = "UTF8_AsTest";
        f = format.format(id);
        assertEquals("utf8_as_test", f);

        id = "UTF8_AsTest_";
        f = format.format(id);
        assertEquals("utf8_as_test", f);

        id = "_UTF8_AsTest_";
        f = format.format(id);
        assertEquals("utf8_as_test", f);

        id = "_UTF8_AsTest_";
        f = format.format(id);
        assertEquals("utf8_as_test", f);

        id = "utf8AsTest_";
        f = format.format(id);
        assertEquals("utf8_as_test", f);

        id = "_9utf8AsTest_";
        f = format.format(id);
        assertEquals("$9utf8_as_test", f);

        id = "__0utf8AsTest_";
        f = format.format(id);
        assertEquals("$0utf8_as_test", f);
    }

    @Test
    public void testPrint() {
        format.print();
    }
}