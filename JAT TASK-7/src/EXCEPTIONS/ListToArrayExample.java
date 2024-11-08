package EXCEPTIONS;

import java.util.ArrayList;
import java.util.List;


public class ListToArrayExample {
 public static void main(String[] args) {
	        // Create a List of Strings
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        // Convert the List to an array
	        String[] array = list.toArray(new String[0]);

	        // Display the array elements
	        System.out.println("Array elements:");
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }
	

		

	}


