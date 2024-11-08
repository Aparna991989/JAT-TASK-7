package EXCEPTIONS;

import java.util.ArrayList;

public class ArrayListExample {
 public static void main(String[] args) {
	        // Create an ArrayList of Strings
	        ArrayList<String> list = new ArrayList<>();

	        // Add elements to the ArrayList
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // Display the ArrayList before removing elements
	        System.out.println("ArrayList before clearing: " + list);

	        // Remove all elements from the ArrayList
	        list.clear();

	        // Display the ArrayList after clearing
	        System.out.println("ArrayList after clearing: " + list);
	    }
	

	}


