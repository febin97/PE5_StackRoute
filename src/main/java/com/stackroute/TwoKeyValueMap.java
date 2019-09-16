package com.stackroute;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoKeyValueMap {
    public Map<String,String> getMap(Map<String,String> map){
        if (map.size()!=2)
            return null;
        Map<String,String> mapOut = new LinkedHashMap<>();
        int i=1;
        String val = "";
        for(String key:map.keySet()){
            if(i==1){
                mapOut.put(key," ");
                i++;
                val = map.get(key);
            }
            else if(i==2){
                mapOut.put(key,val);
            }
        }
        return mapOut;
    }
}
