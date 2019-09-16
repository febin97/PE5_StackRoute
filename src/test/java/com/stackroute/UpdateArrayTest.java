package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayTest {
    UpdateArray obj;
    @Before
    public void setUp() throws Exception {
        obj = new UpdateArray();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void getUpdatedList_CorrectInput_CorrectOutput(){
        assertEquals(Arrays.asList(
                    "Apple","Grape","Melon","Berry"
        ), obj.getUpdatedList(Arrays.asList("Kiwi","Grape","Melon","Berry"),0,"Apple"));
        assertEquals(Arrays.asList(
                "Apple","Grape","Melon","Apple"
        ), obj.getUpdatedList(Arrays.asList("Apple","Grape","Melon","Berry"),3,"Apple"));
    }
    @Test
    public void getUpdatedList_CorrectInput_CorrectOutputFailure(){
        assertNotEquals(Arrays.asList(
                "Apple","Grape","Melon","Melon"
        ), obj.getUpdatedList(Arrays.asList("Kiwi","Grape","Mango","Berry"),0,"Apple"));
        assertNotEquals(Arrays.asList(
                "Apple","Grape","Melon","Appl"
        ), obj.getUpdatedList(Arrays.asList("Apple","Grape","Mango","Berry"),3,"Apple"));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void getUpdatedList_WrongInput_ThrowsException(){
        obj.getUpdatedList(Arrays.asList("Kiwi","Grape","Mango","Berry"),4,"Apple");
    }
    @Test(expected = InputMismatchException.class)
    public void getUpdatedList_WrongInput_ThrowsIOException(){
        obj.getUpdatedList(null,1,"Apple");
    }
}