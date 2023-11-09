package Bai1;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
        hashTable.put(1,"Basic JavaScript");
        hashTable.put(2,"OOP");
        hashTable.put(3,"Overrides");

        for (Integer key : hashTable.keySet()) {
            String value = hashTable.get(key);
                System.out.println(key + "=" + value);
        }
        System.out.println("-------------");
        for (Entry< Integer, String> entry : hashTable.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println("-------------");
        System.out.println("Inital table is " + hashTable);
        String returned_value = (String) hashTable.remove(2);
        System.out.println("--------------------");
        System.out.println("Removed value is " + returned_value);
        System.out.println("--------------------");
        System.out.println("New table is " + hashTable);    

    }
}