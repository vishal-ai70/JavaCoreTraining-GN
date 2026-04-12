import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Custom Exception class to handle invalid marks
class InvalidMarksException extends Exception {
    
    // Constructor receives the error message
    public InvalidMarksException(String message) {
        super(message); // Pass message to parent Exception class
    }
}

public class StudentResult {

    // HashMap to store student names and marks
    // Key = Student Name (String)
    // Value = Marks (Integer)
    static HashMap<String, Integer> students = new HashMap<>();

    // This method adds a student with validated marks
    // If marks are invalid, it throws a custom exception
    static void addStudent(String name, int marks) 
                           throws InvalidMarksException {

        // Check if marks are negative or greater than 100
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                "❌ Invalid marks: " + marks +
                " | Marks must be between 0 and 100!"
            );
        }

        // If marks are valid, store them in the HashMap
        students.put(name, marks);
        System.out.println("✅ " + name + " added successfully!");
    }

    // This method displays Pass/Fail result for all students
    static void displayResults() {
        System.out.println("\n--- Student Results ---");

        // Loop through each entry in the HashMap
        for (Map.Entry<String, Integer> entry 
                        : students.entrySet()) {

            // Get student name from key
            String name = entry.getKey();

            // Get student marks from value
            int marks = entry.getValue();

            // If marks are 40 or above → Pass, otherwise → Fail
            String status = (marks >= 40) ? "✅ Pass" : "❌ Fail";

            // Print the result for each student
            System.out.println(name + " | Marks: " + 
                               marks + " | " + status);
        }
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("🎓 Result Processing System");

        // Ask how many students to enter
        System.out.print("How many students? ");
        int n = sc.nextInt();

        // Loop to take input for each student
        for (int i = 1; i <= n; i++) {

            // Take student name
            System.out.print("Student " + i + " Name: ");
            String name = sc.next();

            // Take student marks
            System.out.print("Marks: ");
            int marks = sc.nextInt();

            // Try to add student — catch exception if marks are invalid
            try {
                addStudent(name, marks);

            } catch (InvalidMarksException e) {
                // Print the error message
                System.out.println(e.getMessage());

                // Decrease i so user can re-enter for same student
                i--;
            }
        }

        // After all students are added, display results
        displayResults();

        // Close the scanner to free resources
        sc.close();
    }
}