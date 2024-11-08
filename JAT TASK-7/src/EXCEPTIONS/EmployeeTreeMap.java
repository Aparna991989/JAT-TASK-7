package EXCEPTIONS;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {

	public static void main(String[] args) {
	// Create a TreeMap of Employee IDs and Names
		        TreeMap<Integer, String> employeeMap = new TreeMap<>();

		        // Add employee IDs and names to the TreeMap
		        employeeMap.put(101, "John");
		        employeeMap.put(102, "Alice");
		        employeeMap.put(103, "Bob");
		        employeeMap.put(104, "Diana");

		        // Display employee names in alphabetical order
		        System.out.println("Employee names in alphabetical order:");
		        employeeMap.values().stream()
		                .sorted()
		                .forEach(System.out::println);
		    }
		}


