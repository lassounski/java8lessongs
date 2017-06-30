package com.daitan.evaluator;

public class EvaluatorChain implements Evaluator {

    private Evaluator nextEvaluator;

    public EvaluatorChain(Evaluator evaluator) {
        this.nextEvaluator = evaluator;
    }

    @Override
    public boolean evaluate(Applicant applicant) {
        return nextEvaluator.evaluate(applicant);
    }
}
