package javaCollections;

import java.util.*;

public class HashesAndTrees {
    /*
     * A 'set' (Hash or Tree) is a collections of items (of the same data type) that does not allow for duplication
     *
     * The key difference is the hashes and trees is:
     *      - hashes are faster to access than trees
     *      - trees are naturally ordered (least to greatest)
     *
     * There is no 'get' method for sets
     * There are no duplicates in sets
     */
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>(); // This set will naturally order itself
        fruits.add("watermelon");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("cantaloupe");
        fruits.add("lychee");

//        System.out.println(fruits);
//
//        System.out.println(fruits.add("apple"));
//        System.out.println(fruits.size());
//        System.out.println(fruits.remove("apple"));
//        System.out.println(fruits);

        // An existing collection cna be passed as a parameter for a new set to transfer the data to the newly created set
        HashSet<String> sameFruits = new HashSet<>(fruits);

        sameFruits.add("apple");
        System.out.println(sameFruits.addAll(fruits));

        System.out.println(sameFruits);

        //use a for-each loop to iterate through a set
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
        /*
         * A map uses a (Key, Value) association
         * the set of keys CANNOT contain duplicates
         *
         * just like sets trees are sorted and hashes are faster
         *
         */

        HashMap<String, String> states = new HashMap<>();

        // To add a (key, value) association to a map use the .put(Key, Value) method
        states.put("Virginia", "Richmond");
        states.put("Alaska", "Juneau");
        states.put("Nebraska", "Lincoln");
        states.put("Nevada", "Carson City");
        states.put("Montana", "Helena");
        states.put("Ohio", "Columbus");
        states.put("Vermont", "Montpelier");

        System.out.println(states);

        // To access values, use the .get(Key) method
        System.out.println(states.get("Virginia"));

        // To get the entire set of keys, use the .keySet() method
        System.out.println(states.keySet());

        // To get all the values of the set, use the .values() method
        System.out.println(states.values());


        TreeMap<String, String> myAmerica = new TreeMap<>(states);
        System.out.println(myAmerica);

        // The best way to iterate through a map is to use a for-each loop to access every value
        // Doing so requires knowing the data type of the set of keys

        Set<String> temp = states.keySet();
        for(String state: temp) {
            System.out.println(state);
        }
    }
}