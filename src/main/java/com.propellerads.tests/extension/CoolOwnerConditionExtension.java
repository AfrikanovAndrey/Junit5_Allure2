package com.propellerads.tests.extension;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;
import java.util.Optional;

public class CoolOwnerConditionExtension implements ExecutionCondition {

    private final static String COOL_DEVELOPER = "a.afrikanov";

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {

        /*
        Optional.empty()

        context.getTestMethod().ifPresent(
                testMethod -> {
                    Owner owner = testMethod.getDeclaredAnnotation(Owner.class);
                    if (owner != null && owner.value().equals(COOL_DEVELOPER)){
                        return ConditionEvaluationResult.enabled("Because developed by " + COOL_DEVELOPER);
                    }
                }
        );
        Optional<Method> testMethod = context.getTestMethod();
        if (testMethod.isPresent()){
            Owner owner = testMethod.get().getDeclaredAnnotation(Owner.class);
            if (owner != null && owner.value().equals(COOL_DEVELOPER)){
                return ConditionEvaluationResult.enabled("Because developed by " + COOL_DEVELOPER);
            }

        }
        */
        return ConditionEvaluationResult.disabled("Unverified test");
    }
}
