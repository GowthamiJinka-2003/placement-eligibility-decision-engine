// Import the Scanner class from java.util package to read input from console
import java.util.Scanner;

// Define the Main class which is the entry point of the application
public class Main {
    // Main method where the program execution starts
    public static void main(String[] args) {
        // Create a Scanner instance to capture input from the standard input stream
        Scanner scanner = new Scanner(System.in);

        // Read the candidate's name as a String from the console
        String name = scanner.next();
        // Read the candidate's score percentage as a double
        double percentage = scanner.nextDouble();
        // Read the number of backlogs the candidate has as an integer
        int backlogs = scanner.nextInt();
        // Read the candidate's year of graduation as an integer
        int graduationYear = scanner.nextInt();

        // Create a new Candidate object initialized with the user's inputs
        Candidate candidate = new Candidate(
            name,            // Pass candidate's name
            percentage,      // Pass candidate's academic percentage
            backlogs,        // Pass candidate's active backlogs count
            graduationYear   // Pass candidate's graduation year
        );

        // Create a new Job object specifying criteria for the position
        Job job = new Job(
            "Infosys",         // Set company name
            "Java Developer",  // Set role or job title
            65.0,              // Set minimum percentage requirement
            0,                 // Set maximum allowable backlogs
            2026               // Set required graduation year
        );

        // Instantiate the EligibilityChecker to evaluate candidate against job requirements
        EligibilityChecker checker = new EligibilityChecker();

        // Print top divider line for formatting
        System.out.println("================================");
        // Print the header title of the result section
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        // Print bottom divider line for formatting
        System.out.println("================================");

        // Print a blank line for readability
        System.out.println();
        // Display candidate's name retrieved using getter method
        System.out.println("Candidate : " + candidate.getName());
        // Display company's name retrieved using getter method
        System.out.println("Company   : " + job.getCompany());
        // Display job role retrieved using getter method
        System.out.println("Role      : " + job.getRole());
        // Print a blank line for readability
        System.out.println();

        // Evaluate eligibility of candidate for the job and store true/false result
        boolean eligible = checker.evaluate(candidate, job);

        // Print a blank line for readability
        System.out.println();

        // Check if the eligibility condition returned true
        if (eligible) {
            // Print confirmation if the candidate meets all requirements
            System.out.println("Final Result : ELIGIBLE");
        } else { // Condition if the candidate does not meet the requirements
            // Print rejection message if candidate is not eligible
            System.out.println("Final Result : NOT ELIGIBLE");
        } // End of if-else condition

        // Print closing decorative border line
        System.out.println("================================");

        // Close scanner object to release underlying system resources
        scanner.close();
    } // End of main method
} // End of Main class