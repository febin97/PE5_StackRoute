package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortSetTest {
    SortSet obj;
    @Before
    public void setUp() throws Exception {
        obj = new SortSet();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void sortedList_CorrectOutput() {
        Set<String> testSet = new LinkedHashSet<>();
        testSet.add("Harry");
        testSet.add("Olive");
        testSet.add("Alice");
        testSet.add("Bluto");
        testSet.add("Eugene");
        assertEquals(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene", "Harry", "Olive"}),obj.SortedList(testSet));
        testSet = new LinkedHashSet<>();
        testSet.add("Febin");
        testSet.add("Olive");
        testSet.add("Archana");
        testSet.add("Aby");
        testSet.add("Divya");
        assertEquals(Arrays.asList(new String[]{"Aby", "Archana", "Divya", "Febin", "Olive"}),obj.SortedList(testSet));
    }
    @Test
    public void sortedList_CorrectOutputFailure() {
        Set<String> testSet = new LinkedHashSet<>();
        testSet.add("Harry");
        testSet.add("Olive");
        testSet.add("Alice");
        testSet.add("Bluto");
        testSet.add("Eugene");
        assertNotEquals(Arrays.asList(new String[]{"Alice", "Blut", "Eugene", "Harry", "Olive"}),obj.SortedList(testSet));
        testSet = new LinkedHashSet<>();
        testSet.add("Febin");
        testSet.add("Olive");
        testSet.add("Archana");
        testSet.add("Aby");
        testSet.add("Divya");
        assertNotEquals(Arrays.asList(new String[]{"Aby", "Febin", "Divya", "Archana", "Olive"}),obj.SortedList(testSet));
    }
    @Test
    public void sortedList_InCorrectInput_RetutnNull(){
        assertNull(obj.SortedList(null));
    }
}