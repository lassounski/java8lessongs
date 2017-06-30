package com.daitan.evaluator;

public class CriminalRecordsEvaluator extends EvaluatorChain {
    public CriminalRecordsEvaluator(Evaluator evaluator) {
        super(evaluator);
    }

    @Override
    public boolean evaluate(Applicant applicant) {
        if (!applicant.hasCriminalRecord()) {
            return super.evaluate(applicant);
        }
        return false;
    }
}
