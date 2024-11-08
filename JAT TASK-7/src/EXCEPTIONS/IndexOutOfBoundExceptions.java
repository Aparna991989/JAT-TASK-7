package EXCEPTIONS;
public class IndexOutOfBoundExceptions {
public static void main(String[] args) {
	       // ArrayIndexOutOfBoundsException Example
	       int[] numbers = {1, 2, 3};

	        try {
	            System.out.println("Accessing index 3 of the array (out of bounds): " + numbers[3]);
	       
	} catch (ArrayIndexOutOfBoundsException e) {
	        
		System.out.println("Error: Array index is out of bounds.");
	       }
 // StringIndexOutOfBoundsException Example
	        String text = "Hello";

	        try {
	            System.out.println("Accessing character at index 5 of the string (out of bounds): " + text.charAt(5));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: String index is out of bounds.");
	        }
}
}
