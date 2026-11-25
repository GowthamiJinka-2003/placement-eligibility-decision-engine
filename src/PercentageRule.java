// Class to check if the candidate has enough percentage for the job
public class PercentageRule extends EligibilityRule {

    // Overriding the method from the parent class
    @Override 
    // Method that returns the name of this rule
    public String getRuleName() {
        // Return the rule name as "Percentage"
        return "Percentage";
    }

    // Overriding the check method from the parent class
    @Override 
    // Method to check if the candidate meets the percentage requirement
    public boolean check(Candidate candidate, Job job) {
        // Return true if candidate's percentage is greater than or equal to required percentage
        return candidate.getPercentage() >= job.getMinimumPercentage();
    }
    
}
