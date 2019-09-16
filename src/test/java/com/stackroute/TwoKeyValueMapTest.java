package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.*;

public class TwoKeyValueMapTest {
    TwoKeyValueMap obj;
    @Before
    public void setUp() throws Exception {
        obj = new TwoKeyValueMap();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void getMap_CorrectOutput() {
        assertEquals( Map.ofEntries(
                entry("val1", " "),
                entry("val2", "java")
                            ),obj.getMap(Map.ofEntries(
                                    entry("val1", "java"),
                                    entry("val2", "c++"))));
        assertEquals( Map.ofEntries(
                entry("val1", " "),
                entry("val2", "mars")
        ),obj.getMap(Map.ofEntries(
                entry("val1", "mars"),
                entry("val2", "c++"))));
    }
    @Test
    public void getMap_CorrectOutputFailure() {
        assertNotEquals( Map.ofEntries(
                entry("val1", " "),
                entry("val2", "c++")
                                ),obj.getMap(Map.ofEntries(
                                        entry("val1", "java"),
                                        entry("val2", "c++"))));
        assertNotEquals( Map.ofEntries(
                entry("val1", " "),
                entry("val2", "c++")
                                ),obj.getMap(Map.ofEntries(
                                        entry("val1", "mars"),
                                        entry("val2", "c++"))));
    }
    @Test
    public void getMap_WrongMapSize_ReturnNUll(){
        assertNull(obj.getMap(Map.ofEntries(
                entry("val1", "mars"))));
    }
}