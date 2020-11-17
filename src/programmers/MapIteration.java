package programmers;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        mapIteration();
    }
    public static void mapIteration() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key01","value01");
        map.put("key02","value02");
        map.put("key03","value03");
        map.put("key04","value04");
        map.put("key05","value05");

        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());

        }

        // 방법 02 : keySet()
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
    }
}
