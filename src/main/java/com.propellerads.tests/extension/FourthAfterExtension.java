package com.propellerads.tests.extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class FourthAfterExtension implements AfterTestExecutionCallback {

    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("Fourth Test Extension - After");
    }
}
