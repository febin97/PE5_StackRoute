package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.*;

public class CountWordsTest {
    CountWords obj;
    @Before
    public void setUp() throws Exception {
        obj = new CountWords();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void mapCountOfWords_CorrectOutput() {
        assertEquals( Map.ofEntries(
                entry("one", 5),
                entry("two", 2),
                entry("three",2)
        ),obj.MapCountOfWords("one one -one___two,,@three,one  three*one?two"));
        assertEquals( Map.ofEntries(
                entry("one", 5),
                entry("two", 2),
                entry("three",2)
        ),obj.MapCountOfWords("one1 one -one___two,,@three,one99  three*one?two1"));
    }
    @Test
    public void mapCountOfWords_CorrectOutputFailure(){
        assertNotEquals( Map.ofEntries(
                entry("one", 5),
                entry("two", 1),
                entry("three",2)
        ),obj.MapCountOfWords("one one -one___two,,@three,one  three*one?two"));
        assertNotEquals( Map.ofEntries(
                entry("one", 5),
                entry("two1", 2),
                entry("three",2)
        ),obj.MapCountOfWords("one1 one -one___two,,@three,one99  three*one?two1"));
    }
    @Test
    public void mapCountOfWords_EmptyInput_ReturnNull(){
        assertNull(obj.MapCountOfWords(null));
    }
}