package com.daitan;

public class QualifiedEvaluator implements Evaluator{
    @Override
    public boolean evaluate(Applicant applicant){
        return applicant.isCredible();
    }
}
