// Class representing a job candidate / student
public class Candidate {
    // Candidate's full name
    private String name;
    // Candidate's academic score percentage
    private double percentage;
    // Number of active backlogs
    private int backlogs;
    // Year the candidate will graduate
    private int graduationYear;
    // Array of technical skills the candidate knows
    private String[] skills;

    // Constructor to initialize candidate's details when created
    public Candidate(
        String name,            // Pass candidate's name
        double percentage,      // Pass candidate's percentage
        int backlogs,           // Pass candidate's backlogs
        int graduationYear,     // Pass candidate's graduation year
        String[] skills         // Pass candidate's skills array
    ) {
        this.name = name;                       // Assign name to instance variable
        this.percentage = percentage;           // Assign percentage to instance variable
        this.backlogs = backlogs;               // Assign backlogs to instance variable
        this.graduationYear = graduationYear;   // Assign graduation year to instance variable
        this.skills = skills;                   // Assign skills array to instance variable
    }

    // Getter method to retrieve candidate's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve candidate's percentage
    public double getPercentage() {
        return percentage;
    }

    // Getter method to retrieve candidate's backlogs count
    public int getBacklogs() {
        return backlogs;
    }

    // Getter method to retrieve candidate's graduation year
    public int getGraduationYear() {
        return graduationYear;
    }

    // Method to check if the candidate possesses a specific required skill
    public boolean hasSkill(String requiredSkill) {
        // Loop through each skill known by the candidate
        for (int i = 0; i < skills.length; i++) {
            // Check if current skill matches required skill (ignores case, e.g., "java" == "JAVA")
            if (skills[i].equalsIgnoreCase(requiredSkill)) {
                return true; // Skill found, return true
            }
        }

        // Return false if the required skill was not found in the array
        return false;
    }
}
