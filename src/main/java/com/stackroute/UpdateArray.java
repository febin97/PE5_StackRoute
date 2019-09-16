package com.stackroute;

import java.util.InputMismatchException;
import java.util.List;

public class UpdateArray {
    public List<String> getUpdatedList(List<String> ls,int pos,String str){
        if(ls==null){
            throw new InputMismatchException();
        }
        if(pos>=ls.size())
            throw new IndexOutOfBoundsException();
        ls.set(pos,str);
        return ls;
    }
}
