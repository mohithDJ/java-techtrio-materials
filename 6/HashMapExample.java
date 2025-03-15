import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();  

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        System.out.println("Name and Age:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
