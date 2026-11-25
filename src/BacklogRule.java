// Class to check if candidate's backlogs are within the allowed limit
public class BacklogRule extends EligibilityRule {

    // Overriding the method from the parent class
    @Override 
    // Method that returns the name of this rule
    public String getRuleName() {
        // Return the rule name as "Backlogs"
        return "Backlogs";
    }

    // Overriding the check method from the parent class
    @Override
    // Method to check if candidate's backlogs do not exceed the allowed limit
    public boolean check(Candidate candidate, Job job) {
        // Return true if candidate's backlogs are less than or equal to allowed backlogs
        return candidate.getBacklogs() <= job.getMaximumBacklogs();
    }
}
