package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student s1,Student s2){
        int ageCompare = s2.getAge() - s1.getAge();
        int idCompare = s1.getId() - s2.getId();
        int nameCompare = s1.getName().compareTo(s2.getName());
        if(ageCompare==0){
            if(nameCompare==0){
                return idCompare;
            }else{
                return nameCompare;
            }
        }else{
            return ageCompare;
        }
    }
    public List<Student> getSortedList(List<Student> myList){
        List<Student> ls= new ArrayList<>();
        ls = myList;
        Collections.sort(ls,new StudentSorter());
        return ls;
    }
}
