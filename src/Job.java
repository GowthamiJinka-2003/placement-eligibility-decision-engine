// Class representing a job posting and its eligibility requirements
public class Job {
    // Name of the recruiting company (e.g., "Infosys")
    private String company;
    // Job profile or designation (e.g., "Java Developer")
    private String role;
    // Cut-off or minimum percentage required
    private double minimumPercentage;
    // Maximum active backlogs permitted
    private int maximumBacklogs;
    // Expected year of graduation (e.g., 2026)
    private int requiredGraduationYear;
    // Array of mandatory skills needed for this job
    private String[] requiredSkills;

    // Constructor to initialize the job details and criteria
    public Job(
        String company,                 // Company name
        String role,                    // Job designation
        double minimumPercentage,       // Minimum cut-off marks
        int maximumBacklogs,            // Maximum allowed backlogs
        int requiredGraduationYear,     // Required batch/passing year
        String[] requiredSkills         // Required skills list
    ) {
        this.company = company;                                 // Store company name
        this.role = role;                                       // Store job role
        this.minimumPercentage = minimumPercentage;             // Store minimum percentage
        this.maximumBacklogs = maximumBacklogs;                 // Store maximum backlogs
        this.requiredGraduationYear = requiredGraduationYear;   // Store required graduation year
        this.requiredSkills = requiredSkills;                   // Store required skills array
    }

    // Getter method to get the company name
    public String getCompany() {
        return company;
    }

    // Getter method to get the job role
    public String getRole() {
        return role;
    }

    // Getter method to get the minimum percentage required
    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    // Getter method to get the maximum backlogs allowed
    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    // Getter method to get the required graduation year
    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }

    // Getter method to get the array of required skills
    public String[] getRequiredSkills() {
        return requiredSkills;
    }
}
