package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class MainTest {
    StudentSorter SS;
    @Before
    public void setUp() throws Exception {
        SS = new StudentSorter();
    }

    @After
    public void tearDown() throws Exception {
        SS = null;
    }
    public String toString(List<Student> ls){
        String str="";
        for(Student s:ls){
            str+= s.toString();
        }
        return str;
    }
    @Test
    public void getSortedList_CorrectOutput(){
        List<Student> myList = new ArrayList<>();
        myList.add(new Student(22,12,"Febin"));
        myList.add(new Student(22,13,"Adityan"));
        myList.add(new Student(23,14,"Sreenath"));
        myList.add(new Student(22,15,"Febin"));
        myList.add(new Student(22,16,"Sachin"));

        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student(23,14,"Sreenath"));
        expectedList.add(new Student(22,13,"Adityan"));
        expectedList.add(new Student(22,12,"Febin"));
        expectedList.add(new Student(22,15,"Febin"));
        expectedList.add(new Student(22,16,"Sachin"));
        assertEquals(toString(expectedList),toString(SS.getSortedList(myList)));
    }
    @Test
    public void getSortedList_CorrectOutputFailure(){
        List<Student> myList = new ArrayList<>();
        myList.add(new Student(22,12,"Febin"));
        myList.add(new Student(22,13,"Adityan"));
        myList.add(new Student(23,14,"Sreenath"));
        myList.add(new Student(22,15,"Febin"));
        myList.add(new Student(22,16,"Sachin"));

        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student(23,14,"Sreenath"));
        expectedList.add(new Student(22,13,"Adityan"));
        expectedList.add(new Student(22,12,"Febin"));
        expectedList.add(new Student(22,15,"Febin"));
        expectedList.add(new Student(22,17,"Sachin"));
        assertNotEquals(toString(expectedList),toString(SS.getSortedList(myList)));
    }

}
