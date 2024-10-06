import java.util.*;
// ADD : put(key,value)
// READ : get(key)
// Update : put(key, newValue);
// Delete : remove(key)
// Search: containsKey(key), containsValue(value)
// Traverse: step1: get all keys using keySet(), traverse key set and use get(key) function
class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Infosys", 200000);
        map.put("Wipro", 150000);
        map.put("TCS", 100000);
        map.put("Cognizant", 175000);

        map.put("Infosys", 210000);// Update
        System.out.println("Infosys emp count is: " + map.get("Infosys"));

        map.remove("Cognizant");
        System.out.println(map);
        System.out.println(map.containsKey("Wipro"));

        // How to get all keys
        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.println(key + "=>" + map.get(key));
        }

    }
}