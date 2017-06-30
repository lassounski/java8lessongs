package com.daitan.exercises;

import com.daitan.evaluator.Applicant;
import com.daitan.evaluator.CreditEvaluator;
import com.daitan.evaluator.CriminalRecordsEvaluator;
import com.daitan.evaluator.EmploymentEvaluator;
import com.daitan.evaluator.Evaluator;
import com.daitan.evaluator.QualifiedEvaluator;

import org.junit.Test;

public class EvaluatorTest {

    private Applicant applicant = new Applicant();

    @Test
    public void shouldEvaluateInChain() {
        evaluate(applicant, new CreditEvaluator(new QualifiedEvaluator()));
        evaluate(applicant, new EmploymentEvaluator(new QualifiedEvaluator()));
        evaluate(applicant,
                new CriminalRecordsEvaluator(new EmploymentEvaluator(new QualifiedEvaluator())));
    }

    private static void evaluate(Applicant applicant, Evaluator evaluator) {
        String result = evaluator.evaluate(applicant) ? "accepted" : "rejected";
        System.out.println("Results of evaluating applicant: " + result);
    }
}
