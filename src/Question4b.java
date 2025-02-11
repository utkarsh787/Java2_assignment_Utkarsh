/* Q)  -> Given a list of objects of following class:

class Employee{
    String fullName;
    Long salary;
    String city;
}

Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
        Note: Full name is concatenation of first name, middle name and last name with single space in between.*/

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    // Constructor
    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    // Getter for first name (splitting the full name)
    public String getFirstName() {
        return fullName.split(" ")[0]; // Extract first word as first name
    }
}

public class Question4b {
    public static void main(String[] args) {
        // Sample employee list
        List<Employee> employees = Arrays.asList(
                new Employee("Utkarsh Gupta", 4000L, "Delhi"),
                new Employee("Ritesh Gupta", 4000L, "Delhi"),
                new Employee("Amit Yadav", 4500L, "Greater Noida"),
                new Employee("Vishal Rajput", 3000L, "Mumbai"),
                new Employee("Ravi Kumar", 3500L, "Indore"),
                new Employee("Amit Sharma", 4000L, "Agra")
        );

        // Using Java 8 Stream API to filter and get unique first names
        List<String> uniqueFirstNames = employees.stream()
                .filter(emp -> emp.salary < 5000 && "Delhi".equalsIgnoreCase(emp.city)) // Filter employees
                .map(Employee::getFirstName) // Extract first names
                .distinct() // Remove duplicates
                .collect(Collectors.toList()); // Collect into list

        // Print the result
        System.out.println("Unique First Names of eligible employees: " + uniqueFirstNames);
    }
}
