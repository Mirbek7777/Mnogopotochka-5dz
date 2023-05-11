import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {


    private Map<String, String> map = null;

    public int add(String name, String phoneNumber) {
        if (map == null) {
            map = new HashMap<>();
            map.put(name, phoneNumber);
        }

        map.put(name, phoneNumber);
        return map.size();
    }
    public String findByNumber(String value) {

        Optional<String> result = map.entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        return result.get();
    }


}