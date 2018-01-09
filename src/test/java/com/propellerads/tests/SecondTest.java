package com.propellerads.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Секонд тест")
public class SecondTest {

    @Test
    @DisplayName("Первый тест")
    @Owner("m.sidelnikov")
    @Description("Test description with link <a href='http://yandex.ru'>Yandex</a>")
    public void secondTest(){
        testStep();
    }

    @Step("Test step")
    public void testStep(){
        System.out.println("Test step");
    }
}
