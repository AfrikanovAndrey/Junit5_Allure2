package com.propellerads.tests.extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SecondExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("Second Test Extension - Before");
    }

    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("Second Test Extension - After");
    }
}
