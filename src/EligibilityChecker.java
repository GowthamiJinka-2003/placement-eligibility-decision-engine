// Class responsible for checking a candidate against all eligibility rules
public class EligibilityChecker {

    // Array to store all the rules that need to be checked
    private EligibilityRule[] rules;

    // Constructor to initialize the list of rules
    public EligibilityChecker() {
        // Create an array holding all three rules: Percentage, Backlogs, and Graduation Year
        rules = new EligibilityRule[] {
            new PercentageRule(),     // Check candidate's percentage
            new BacklogRule(),        // Check candidate's backlogs
            new GraduationYearRule(),  // Check candidate's graduation year
            new SkillRule()          // check candidate'sskillrule
        };
    }

    // Method to evaluate candidate against all rules for a specific job
    public boolean evaluate(Candidate candidate, Job job) {
        // Assume candidate is eligible until any rule fails
        boolean eligible = true;

        // Loop through each rule one by one
        for (int i = 0; i < rules.length; i++) {
            // Check current rule for this candidate and job (returns true or false)
            boolean passed = rules[i].check(candidate, job);

            // If the rule check passed
            if (passed) {
                // Print PASS message with the rule name
                System.out.println(rules[i].getRuleName() + " : PASS");
            } else { // If the rule check failed
                // Print FAIL message with the rule name
                System.out.println(rules[i].getRuleName() + " : FAIL");
                // Set eligible to false because at least one rule failed
                eligible = false;
            }
        }

        // Return final eligibility result (true if all passed, false if any failed)
        return eligible;
    }
}
