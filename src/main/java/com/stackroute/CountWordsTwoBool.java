package com.stackroute;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordsTwoBool {
    public Map<String, Boolean> MapCountWordsTwoBool(String[] strArr){
        if (strArr==null){
            return null;
        }
        Map<String,Boolean> map = new LinkedHashMap<>();
        String strCurr = "";
        for (int i=0;i<strArr.length;i++){
            strCurr = strArr[i];
            if (strCurr!="") {
                if (map.containsKey(strCurr)) {
                    map.put(strCurr, true);
                } else {
                    map.put(strCurr, false);
                }
            }
        }
        return map;
    }
}
