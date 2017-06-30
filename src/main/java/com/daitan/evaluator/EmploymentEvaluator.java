package com.daitan.evaluator;

public class EmploymentEvaluator extends EvaluatorChain {
    public EmploymentEvaluator(Evaluator evaluator) {
        super(evaluator);
    }

    @Override
    public boolean evaluate(Applicant applicant) {
        if (applicant.getEmploymentYears() > 0) {
            return super.evaluate(applicant);
        }
        return false;
    }
}
