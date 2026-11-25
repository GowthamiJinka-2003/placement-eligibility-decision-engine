// Class to check if candidate's passing year matches the company's requirement
public class GraduationYearRule extends EligibilityRule {

    // Overriding the method from the parent class
    @Override 
    // Method that returns the name of this rule
    public String getRuleName() {
        // Return the rule name as "Graduation Year"
        return "Graduation Year";
    }

    // Overriding the check method from the parent class
    @Override
    // Method to check if candidate's graduation year matches the required year
    public boolean check(Candidate candidate, Job job) {
        // Return true if candidate's graduation year equals the required graduation year
        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
    }
    
}
