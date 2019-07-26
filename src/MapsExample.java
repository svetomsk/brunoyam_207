import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "1'))");
        idToName.put(2, "2'))");
        System.out.println(idToName.put(12, "value"));
        System.out.println(idToName);
        System.out.println(idToName.put(12, "another value"));
        System.out.println(idToName);

        idToName.putIfAbsent(12, "absent value");
        System.out.println(idToName);

        System.out.println(idToName.get(122));
        System.out.println(idToName.getOrDefault(123, "default"));
        System.out.println(idToName.get(12));

        System.out.println(idToName.keySet());
        List<String> values = new ArrayList<>(idToName.values());
        for(String s : idToName.values()) {
            System.out.println(s);
        }

        for(Integer key : idToName.keySet()) {
            String value = idToName.get(key);

        }

        for(Map.Entry<Integer, String> entyr : idToName.entrySet()) {
            System.out.println(entyr.getKey() + " " + entyr.getValue());
        }
    }
}
