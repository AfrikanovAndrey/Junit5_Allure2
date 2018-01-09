package com.propellerads.tests.extension;


import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class ExceptionHandlerExtension implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println("Exception handled : " + throwable.getClass());
    }
}
