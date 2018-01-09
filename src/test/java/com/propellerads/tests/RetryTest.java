package com.propellerads.tests;

import com.propellerads.libs.extensions.retry.RepeatIfExceptionsCondition;
import com.propellerads.libs.extensions.retry.RepeatedIfExceptionsInvocationContext;
import com.propellerads.libs.extensions.retry.RepeatedIfExceptionsTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;


//@ExtendWith(RepeatIfExceptionsCondition.class)
public class RetryTest {

    private static int count = 0;

    //@Test
    @RepeatedIfExceptionsTest(exceptions = IOException.class, repeats = 3, name = "Test name")
    void test() throws IOException{
        count++;
        System.out.println("count = " + count);
        if (count <= 2){
            throw new IOException();
        }
    }

    @Test
    void test2(){
    }
}
