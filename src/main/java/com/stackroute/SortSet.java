package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
    public List<String> SortedList(Set<String> setStr){
        if (setStr == null)
            return null;
        Set<String> sortedSet = new TreeSet<>(setStr);
        List<String> sortedList = new ArrayList<>(sortedSet);
        return sortedList;
    }
}
