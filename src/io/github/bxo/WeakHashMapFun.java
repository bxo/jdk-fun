package io.github.bxo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapFun {

    public static void main(String[] args) throws Exception {
        String key1 = new String("key1");
        String key2 = new String("key2");
        Map<String, String> weakMap = new WeakHashMap();
        Map<String, String> map = new HashMap();
        map.put(key1, "value1");
        map.put(key2, "value2");


        weakMap.put(key1, "value1");
        weakMap.put(key2, "value2");

        map.remove(key1);

        key1=null;
        key2=null;

        System.gc();
        Iterator i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry en = (Map.Entry)i.next();
            System.out.println("map:"+en.getKey()+":"+en.getValue());
        }

        Iterator j = weakMap.entrySet().iterator();
        while (j.hasNext()) {
            Map.Entry en = (Map.Entry)j.next();
            System.out.println("weakMap:"+en.getKey()+":"+en.getValue());

        }
    }
}
