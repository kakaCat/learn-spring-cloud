package learn.spring.AbstractMapDate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractMapDates implements InterfaceMapDates{

    static final Map<String, String> commonMap = new ConcurrentHashMap<>();

    @Override
    public void putDate(String key,String value){
        commonMap.put(key, value);
    }

    @Override
    public String getDate(String key){
         return commonMap.get(key);
    }


}
