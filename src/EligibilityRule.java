// Blueprint class that other rule classes must inherit from.
public abstract class EligibilityRule {

    // Method that child classes must implement to return the rule's name.
    public abstract String getRuleName();

    // Method that child classes must implement to return true if the candidate qualifies, or false if not.
    public abstract boolean check(Candidate candidate, Job job);

// End of the EligibilityRule class.
}
