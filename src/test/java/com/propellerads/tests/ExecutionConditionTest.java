package com.propellerads.tests;


import com.propellerads.tests.extension.CoolOwnerConditionExtension;
import com.propellerads.tests.extension.ExceptionHandlerExtension;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ExceptionHandlerExtension.class, CoolOwnerConditionExtension.class})
public class ExecutionConditionTest {

    @Test
    @Owner("m.sidelnikov")
    void test(){

    }

    @Test
    @Owner("a.afrikanov")
    void test2(){

    }

    @Test
    @Owner("a.moskvin")
    void test3(){

    }
}
