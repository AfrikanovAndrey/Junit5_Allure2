package com.propellerads.tests.extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class FirtsExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("First Test Extension - After");
    }

    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("First Test Extension - Before");
    }
}
