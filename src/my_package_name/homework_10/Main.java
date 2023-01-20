package my_package_name.homework_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> myCollection = new HashMap<>();

        myCollection.put("key1", "Carrot");
        myCollection.put("key2", "Kiwi");
        myCollection.put("key3", "Apple");
        myCollection.put("key4", "Banana");
        myCollection.put("key5", "Kiwi");

        System.out.println(myCollection);
        System.out.println(sortCollectionByValue(myCollection));
    }

    public static Map<String, String> sortCollectionByValue(Map<String, String> collection) {
        ArrayList<String> values = new ArrayList<>();
        collection.forEach((k, v) ->
                values.add(v));
        Collections.sort(values);

        Map<String, String> sortedCollection = new LinkedHashMap<>();

        values.forEach(value -> collection.forEach((k, v) -> {
            if (value.equals(v)) {
                sortedCollection.put(k, value);
            }
        }));
        return sortedCollection;
    }
}