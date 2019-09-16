package com.stackroute;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountWords {
    public Map<String,Integer> MapCountOfWords(String str){
        if(str=="" || str == null)
            return null;
        char[] strArr = str.toCharArray();
        String strCurr="";
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        for(int i=0;i<strArr.length;i++){
            if(Character.isLetter(strArr[i])){
                strCurr+=strArr[i];
            }else if(strCurr!=""){
                if(map.containsKey(strCurr)){
                    int count = map.get(strCurr)+1;
                    map.put(strCurr,count);
                }else{
                    map.put(strCurr,1);
                }
                strCurr = "";
            }
        }
        if (strCurr!=""){
            if(map.containsKey(strCurr)){
                int count = map.get(strCurr)+1;
                map.put(strCurr,count);
            }else{
                map.put(strCurr,1);
            }
        }
        return map;
    }
}
