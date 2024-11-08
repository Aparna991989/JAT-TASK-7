package EXCEPTIONS;

import java.util.Scanner;

public class DivisionProgram {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter the first number: ");
	            int num1 = scanner.nextInt();

	            System.out.print("Enter the second number: ");
	            int num2 = scanner.nextInt();

	            int result = num1 / num2;
	            System.out.println("The result is: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } finally {
	            scanner.close();
	        }
	    }
	
}
