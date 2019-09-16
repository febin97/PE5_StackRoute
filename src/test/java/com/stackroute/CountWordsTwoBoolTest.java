package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.*;

public class CountWordsTwoBoolTest {
    CountWordsTwoBool obj;
    @Before
    public void setUp() throws Exception {
        obj = new CountWordsTwoBool();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void mapCountWordsTwoBool_CorrectOutput() {
        assertEquals( Map.ofEntries(
                entry("a", true),
                entry("b", false),
                entry("c",true),
                        entry("d",false)
                                        ),obj.MapCountWordsTwoBool(new String[]{"a", "b", "c", "d", "a", "c", "c"}));
        assertEquals( Map.ofEntries(
                entry("a", true),
                entry("b", false),
                entry("c",true),
                entry("d",true)
        ),obj.MapCountWordsTwoBool(new String[]{"a", "b", "c", "d", "a", "c", "c","d"}));
    }
    @Test
    public void mapCountWordsTwoBool_CorrectOutputFailure() {
        assertNotEquals( Map.ofEntries(
                entry("a", true),
                entry("b", false),
                entry("c",true),
                entry("d",true)
        ),obj.MapCountWordsTwoBool(new String[]{"a", "b", "c", "d", "a", "c", "c"}));
        assertNotEquals( Map.ofEntries(
                entry("a", true),
                entry("b", false),
                entry("c",true),
                entry("d",true)
        ),obj.MapCountWordsTwoBool(new String[]{"a", "b", "c", "d", "a", "c", "c"}));
        assertNotEquals( Map.ofEntries(
                entry("a", true)
        ),obj.MapCountWordsTwoBool(new String[]{"a"}));
    }
    @Test
    public void mapCountWordsTwoBool_NoInput_ReturnNull(){
        assertNull(obj.MapCountWordsTwoBool(null));
        assertNotNull(obj.MapCountWordsTwoBool(new String[]{""}));
    }

}