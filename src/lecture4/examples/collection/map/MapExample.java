package lecture4.examples.collection.map;

import lecture4.examples.collection.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        Person levan = new Person("Levan", 28);
        Person alex = new Person("alex", 23);
        Person davit = new Person("davit", 25);

        //HashMap
        Map<Integer, Person> hashMap = new HashMap<>();
        hashMap.put(85, levan);
        hashMap.put(85, alex);
        hashMap.put(15, alex);
        hashMap.put(76, davit);

        //Insertion order not preserved
        for (Map.Entry<Integer, Person> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        //Constant time O(1)
        System.out.println("get(): " + hashMap.get(15));


        System.out.println();

        //HashMap
        Map<Integer, Person> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(85, levan);
        linkedHashMap.put(15, alex);
        linkedHashMap.put(76, davit);

        //Insertion order preserved
        for (Map.Entry<Integer, Person> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        //TreeMap
        Map<Integer, Person> treeMap = new TreeMap<>();
        treeMap.put(85, alex);
        treeMap.put(15, davit);
        treeMap.put(76, levan);

        //Ordered according to Comparable of the key
        for (Map.Entry<Integer, Person> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Logarithmic, O(log N)
        System.out.println("get(): " + treeMap.get(15));
    }
}
