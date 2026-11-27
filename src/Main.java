// Import Scanner class from java.util package to read input from console
import java.util.Scanner;

// Define Main class which is the entry point of the program
public class Main {
    // Main method where program execution starts
    public static void main(String[] args) {
        // Create a Scanner object to read keyboard input
        Scanner scanner = new Scanner(System.in);

        // Read candidate's name
        String name = scanner.next();
        // Read candidate's academic percentage
        double percentage = scanner.nextDouble();
        // Read candidate's backlog count
        int backlogs = scanner.nextInt();
        // Read candidate's graduation year
        int graduationYear = scanner.nextInt();

        // Read total number of skills the candidate has
        int skillCount = scanner.nextInt();
        // Create an array to store the candidate's skills
        String[] skills = new String[skillCount];

        // Loop to read each candidate skill one by one
        for (int i = 0; i < skillCount; i++) {
            // Read and store current skill in the skills array
            skills[i] = scanner.next();
        }

        // Create Candidate object using the input details
        Candidate candidate = new Candidate(
            name,            // Candidate name
            percentage,      // Candidate percentage
            backlogs,        // Candidate backlogs
            graduationYear,  // Candidate graduation year
            skills           // Candidate skills array
        );

        // Read total number of job postings to create
        int jobCount = scanner.nextInt();
        // Create an array of Job objects
        Job[] jobs = new Job[jobCount];

        // Loop through to read details for each job
        for (int i = 0; i < jobCount; i++) {
            // Read company name
            String company = scanner.next();
            // Read job role/title
            String role = scanner.next();
            // Read minimum required percentage
            double minimumPercentage = scanner.nextDouble();
            // Read maximum allowable backlogs
            int maximumBacklogs = scanner.nextInt();
            // Read required graduation passing year
            int requiredGraduationYear = scanner.nextInt();

            // Read count of mandatory skills required for this job
            int requiredSkillCount = scanner.nextInt();
            // Create an array to hold the required skills
            String[] requiredSkills = new String[requiredSkillCount];

            // Loop to read each required skill for this job
            for (int j = 0; j < requiredSkillCount; j++) {
                // Read and store required skill
                requiredSkills[j] = scanner.next();
            }

            // Create and store the Job object in the jobs array
            jobs[i] = new Job(
                company,
                role,
                minimumPercentage,
                maximumBacklogs,
                requiredGraduationYear,
                requiredSkills
            );
        }

        // Print an empty line for spacing
        System.out.println();
        // Print header for the available jobs list
        System.out.println("AVAILABLE JOBS");

        // Loop through and display all available jobs
        for (int i = 0; i < jobs.length; i++) {
            // Print job number, company name, and job role (e.g., "1. Infosys - Java Developer")
            System.out.println((i + 1) + ". " + jobs[i].getCompany() + " - " + jobs[i].getRole());
        }
    
        // Read user's chosen job number from the displayed list (e.g., 1, 2, 3...)
        int selectedJobNumber = scanner.nextInt();
        // Retrieve the selected job from array (subtract 1 because arrays start at index 0)
        Job selectedJob = jobs[selectedJobNumber - 1];

        // Create an instance of EligibilityChecker
        EligibilityChecker checker = new EligibilityChecker();

        // Print header border line
        System.out.println("================================");
        // Print header title
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        // Print header border line
        System.out.println("================================");

        // Print empty line for spacing
        System.out.println();
        // Display candidate's name
        System.out.println("Candidate : " + candidate.getName());
        // Display selected company's name
        System.out.println("Company   : " + selectedJob.getCompany());
        // Display selected job role
        System.out.println("Role      : " + selectedJob.getRole());
        // Print empty line for spacing
        System.out.println();

        // Check if candidate is eligible for the selected job
        boolean eligible = checker.evaluate(candidate, selectedJob);

        // Print empty line for spacing
        System.out.println();

        // Check the final eligibility status
        if (eligible) {
            // Print eligible message if all rules passed
            System.out.println("Final Result : ELIGIBLE");
        } else {
            // Print not eligible message if any rule failed
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        // Print footer border line
        System.out.println("================================");

        // Close scanner to release system resources
        scanner.close();
    }
}
