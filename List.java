import java.util.*;

public class List {
    public static void main(String[] args) {

        // Creating the Arraylist of Integer
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(30);
        arr.add(20);

        System.out.println(arr);
        System.out.println(arr.size());     // -> size of list
        System.out.println(arr.get(1));// -> element at index 1

        // Creating the Arraylist of String
        ArrayList<String> str= new ArrayList<>();
        str.add("Nikku");
        str.add("Vishal");
        str.add("Ritik");
        str.add("Akash");

        System.out.println(str);


    }
}
