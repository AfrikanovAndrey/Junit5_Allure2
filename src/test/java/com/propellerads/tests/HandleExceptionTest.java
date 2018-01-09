package com.propellerads.tests;

import com.propellerads.tests.extension.ExceptionHandlerExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

@ExtendWith(ExceptionHandlerExtension.class)
public class HandleExceptionTest {

    @Test
    void test() throws IOException {
        throw new IOException("Bla bla bla");
    }
}
