package com.propellerads.tests.extension;

import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ThirdBeforeExtension implements BeforeTestExecutionCallback {

    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("Third Test Extension - Before");
    }
}
