package Bai2;

import java.util.Hashtable;
import java.util.Map.Entry;

class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class HashTableDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Student 1");
        Student student2 = new Student(2,"Student 2");
        Student student3 = new Student(3,"Student 3");

        Hashtable<Integer, Student>hashtable = new Hashtable<Integer, Student>();
        hashtable.put(student1.getId(),student1);
        hashtable.put(student2.getId(),student2);
        hashtable.put(student3.getId(),student3);

        for (Integer key : hashtable.keySet()) {
            Student value = hashtable.get(key);
            System.out.println(key + "=" + value);
        }
            System.out.println("--------------------------------");
            Student returned_value = (Student)hashtable.remove(2);
            System.out.println("--------------------------------");
            System.out.println("Returned value: " + returned_value);
            System.out.println("--------------------------------");

        for (Entry<Integer, Student> entry : hashtable.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " = " + value);
        }
            System.out.println("--------------------------------");
            System.out.println("Is the key '1' present ? " + hashtable.containsKey(1));
    }
}

    
