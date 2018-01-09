package com.propellerads.tests.extension;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ClassExtension implements BeforeEachCallback {

    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("Class Extension : before each");
    }
}
